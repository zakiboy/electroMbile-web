package com.electrombile.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import com.electrombile.Filter.WebUtil;


/**
 * cxf webservice的拦截处理
 *
 */
public class BaseCxfInterceptor extends AbstractPhaseInterceptor<Message> {

	private static final Logger logger = LoggerFactory
			.getLogger(BaseCxfInterceptor.class);

	public BaseCxfInterceptor() {
		super(Phase.PRE_INVOKE);

	}

	public BaseCxfInterceptor(String str) {
		super(str);
	}

	public void handleMessage(Message message) throws Fault {
        HttpServletRequest request = (HttpServletRequest)message.get("HTTP.REQUEST");
        if(request!=null){
            MDC.put("clientIP", WebUtil.getRemoteIP(request));
        }
	}

}