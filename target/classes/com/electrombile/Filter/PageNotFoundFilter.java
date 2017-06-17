package com.electrombile.Filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;

public class PageNotFoundFilter extends DispatcherServlet {

	private static final long serialVersionUID = -5836712405829407244L;

	@Override
	protected void noHandlerFound(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("successful execute...");
		response.sendRedirect(request.getContextPath() + "/404");
	}

}
