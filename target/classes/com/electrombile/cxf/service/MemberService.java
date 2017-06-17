package com.electrombile.cxf.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.electrombile.cxf.domain.BaseOutDomain;
import com.electrombile.cxf.domain.member.WeChatMember;

@WebService
public interface MemberService {
	
    /**
     * @param MemberRequest
     * 新增微信用户信息
     */
	BaseOutDomain addMemberInfo(@WebParam(name = "member")WeChatMember member);
	
    /**
     * @param MemberRequest
     * 发送微信用户地理位置信息
     */
	BaseOutDomain sendMemberPosition(@WebParam(name = "adress")String adress);
	
    /**
     * @param MemberRequest
     * 用户开锁
     */
	BaseOutDomain unlockingMobile(@WebParam(name = "member")WeChatMember member);
	
    /**
     * @param MemberRequest
     * 用户关锁
     */
	BaseOutDomain colseLockMobile(@WebParam(name = "member")WeChatMember member);
	
	
    /**
     * @param MemberRequest
     * 用户关锁
     */
	BaseOutDomain getScopeMbilePageList(@WebParam(name = "member")WeChatMember member);
	
}
