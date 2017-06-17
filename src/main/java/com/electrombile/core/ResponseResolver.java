package com.electrombile.core;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.electrombile.cxf.domain.BaseOutDomain;
import com.electrombile.cxf.domain.member.WeChatMember;
import com.electrombile.cxf.domain.member.WeChatMemberAdress;
import com.electrombile.cxf.domain.order.OrderBack;
import com.electrombile.cxf.domain.order.OrderMessage;


@Provider
@Produces( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ResponseResolver implements ContextResolver<JAXBContext> {
	private JAXBContext ctx;

	public ResponseResolver() {
		try {
			this.ctx = JAXBContext.newInstance(Response.class,
					WeChatMember.class,WeChatMemberAdress.class,OrderMessage.class
            );
		} catch (JAXBException ex) {
			throw new RuntimeException(ex);
		}
	}

	public JAXBContext getContext(Class<?> type) {
		if (type.equals(BaseOutDomain.class)
				|| type.equals(BaseOutDomain.class)
				|| type.equals(WeChatMember.class)
				|| type.equals(WeChatMemberAdress.class)
				|| type.equals(OrderBack.class)
				|| type.equals(OrderMessage.class)) {
			return ctx;
		}
		return null;
	}
}
