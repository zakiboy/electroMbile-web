package com.ct.junit;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.ScheduleBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author admin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class QuartzJunit {
	@Resource
	private SchedulerFactoryBean schedulerFactoryBean;
	
	@Resource
	private Scheduler schedulermy;
	
	/**
	 * @return Scheduler
	 */
	public Scheduler getScheduler(){
		return schedulerFactoryBean.getScheduler();
	}
	
	/**
	 * @param jobName
	 * @param jobGroupName
	 * @param targetClass
	 * @param targetMethod
	 * @return JobDetail
	 */
	public JobDetail jobCreate(String jobName,String jobGroupName,String targetClass,String targetMethod){
		Map<String, Object> map = new HashMap<String,Object>();
		JobDataMap jobDataMap = new JobDataMap(map);
		jobDataMap.put("targetClass", targetClass);
		jobDataMap.put("targetMethod", targetMethod);
		JobDetail job = null;//JobBuilder.newJob(QuartzProxyJob.class).setJobData(jobDataMap).withIdentity(jobName, jobGroupName).build();
		return job;
	}
	
	/**
	 * @param triggerName
	 * @param triggerGroupName
	 * @param cronExpression
	 * @return Trigger
	 */
	public Trigger triggerCreate(String triggerName,String triggerGroupName,String cronExpression){
		ScheduleBuilder schedBuilder = CronScheduleBuilder.cronSchedule(cronExpression);
		Trigger trigger = TriggerBuilder.newTrigger().withSchedule(schedBuilder).withIdentity(triggerName, triggerGroupName).build();
		return trigger;
	}
	
	/**
	 * @param jobDetail
	 * @param trigger
	 * @throws SchedulerException
	 */
	public void startJob(JobDetail jobDetail,Trigger trigger) throws SchedulerException{
		Scheduler scheduler = getScheduler();
		scheduler.scheduleJob(jobDetail, trigger);
		scheduler.start();
	}
	
	
	/**
	 * @throws InterruptedException
	 */
	@Test
	public void jobTest() throws InterruptedException{
//		JobDetail jobDetail = jobCreate("showInfo", "chen",TestJob.class.getName(),"showInfo");
//		Trigger trigger = triggerCreate("showInfoTrigger", "chen", "*/20 * * * * ?");
//		try {
//			startJob(jobDetail, trigger);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Thread.sleep(1000*60*60);
	}
	
	/**
	 * @throws SchedulerException
	 */
	@Test
	public void deleteJob() throws SchedulerException{
		Scheduler scheduler = getScheduler();
		JobKey jobKey = JobKey.jobKey("showInfo", "chen");
		scheduler.deleteJob(jobKey);
	}
	
	
	/**
	 * 
	 */
	@Test
	public void showInstanceName(){
		
		try {
			System.out.println(schedulermy.getSchedulerName().toString());
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	
}
