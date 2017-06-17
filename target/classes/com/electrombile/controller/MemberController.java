package com.electrombile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PathParam;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.electrombile.core.SystemConstant;
import com.electrombile.model.MemberInfo;
import com.electrombile.request.UserSession;
import com.electrombile.response.MemberResponse;
import com.electrombile.service.MemberinfoService;
import com.electrombile.utils.DateUtils;

/**
 * @author admin
 *
 */
@Controller
@RequestMapping(value = "member")
public class MemberController {
	
	@Autowired
	private MemberinfoService memberService;
	
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "queryMemberList")
	public ModelAndView queryUserList(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		MemberInfo memberInfo = new MemberInfo();
		List<MemberInfo> memberList = memberService.queryList(memberInfo);
		List<MemberResponse> members = null;
		if (null != memberList && memberList.size() > 0) {
			 members = new ArrayList<MemberResponse>();
			for (MemberInfo member:memberList) {
				MemberResponse re = new MemberResponse();
				BeanUtils.copyProperties(member, re);
				re.setSubscribeTime(DateUtils.setUtilDateToString(member.getSubscribeTime()));
				re.setBirthday(DateUtils.setUtilDateToString(member.getBirthday()));
				re.setCreateDate(DateUtils.setUtilDateToString(member.getCreateDate()));
				members.add(re);
			}
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("members", members);
		modelAndView.setViewName("member/member_list");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "queryMemberInfo")
	public ModelAndView queryMemberInfo(HttpServletRequest request,@RequestParam("memberId")String memberId){
		ModelAndView modelAndView = new ModelAndView();
		MemberInfo memberInfo = memberService.loadMemberInfo(Integer.valueOf(memberId));
		MemberResponse member = new MemberResponse();
		BeanUtils.copyProperties(memberInfo, member);
		member.setBirthday(DateUtils.setUtilDateToString(memberInfo.getBirthday()));
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("member", member);
		modelAndView.setViewName("member/member_info");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "findMemberInfo")
	public ModelAndView findUserInfo(HttpServletRequest request,@RequestParam("memberId")String memberId){
		ModelAndView modelAndView = new ModelAndView();
		MemberInfo memberInfo = memberService.loadMemberInfo(Integer.valueOf(memberId));
		MemberResponse member = new MemberResponse();
		BeanUtils.copyProperties(memberInfo, member);
		member.setBirthday(DateUtils.setUtilDateToString(memberInfo.getBirthday()));
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.addObject("member", member);
		modelAndView.setViewName("member/member_update");
		return modelAndView;
	}
	
    /**
     * @return String
     */
    @RequestMapping(value = "addMember")
    public ModelAndView addMember(HttpServletRequest request) {
    	ModelAndView modelAndView = new ModelAndView();
    	UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
    	modelAndView.addObject("user", user);
    	modelAndView.setViewName("member/member_add");
    	return modelAndView;
    } 
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "addMemberInfo")
	public ModelAndView addUserInfo(HttpServletRequest request,@PathParam("member")MemberResponse member){
		ModelAndView modelAndView = new ModelAndView();
		boolean isDate = DateUtils.checkDateFormat(member.getBirthday());
		String msg = "";
		if (isDate) {
			MemberInfo memberInfo = new MemberInfo();
			BeanUtils.copyProperties(member, memberInfo);
			memberInfo.setStatus(0);
			memberInfo.setBirthday(DateUtils.setStringToUtilDate(member.getBirthday()));
			int num = memberService.insertMemberInfo(memberInfo);
			if (num > 0) {
				msg = "新增成功！";
			}else {
				msg =  "新增失败！";
			}
		}else {
			msg =  "日期格式错误！请从新输入！";
		}
		modelAndView.addObject("msg", msg);
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("member/member_add");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "updateMemberInfo")
	public ModelAndView updateUserInfo(HttpServletRequest request,@PathParam("member")MemberResponse member){
		ModelAndView modelAndView = new ModelAndView();
		MemberInfo memberInfo = new MemberInfo();
		BeanUtils.copyProperties(member, memberInfo);
		memberInfo.setBirthday(DateUtils.setStringToUtilDate(member.getBirthday()));
		int num = memberService.updateMemberInfo(memberInfo);
		if (num > 0) {
			modelAndView.addObject("msg", "修改成功！");
		}else {
			modelAndView.addObject("msg", "修改失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("member/member_update");
		return modelAndView;
	}
	
	/**
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value = "deleteMemberInfo")
	public ModelAndView deleteUserInfo(HttpServletRequest request,@RequestParam("memberId")String memberId){
		ModelAndView modelAndView = new ModelAndView();
		int num = memberService.deleteMemberInfo(Integer.valueOf(memberId));
		if (num > 0) {
			modelAndView.addObject("msg", "删除成功！");
		}else {
			modelAndView.addObject("msg", "删除失败！");
		}
		UserSession user = (UserSession) request.getSession().getAttribute(SystemConstant.AUTH_TOKEN_SESSION);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("member/member_list");
		return modelAndView;
	}
	
}
