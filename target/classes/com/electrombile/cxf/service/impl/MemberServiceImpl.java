package com.electrombile.cxf.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.electrombile.core.SystemConstant;
import com.electrombile.cxf.domain.BaseOutDomain;
import com.electrombile.cxf.domain.mbile.MbileInfo;
import com.electrombile.cxf.domain.member.WeChatMember;
import com.electrombile.cxf.domain.member.WeChatMemberAdress;
import com.electrombile.cxf.service.MemberService;
import com.electrombile.model.ElectrombileInfo;
import com.electrombile.model.MemberInfo;
import com.electrombile.service.ElectrombileInfoService;
import com.electrombile.service.MemberinfoService;
import com.electrombile.service.RidingRecordService;
import com.electrombile.utils.XMLUtil;



public class MemberServiceImpl implements MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Autowired
	private MemberinfoService memberService;
	@Autowired
	private RidingRecordService recordService;
	@Autowired
	private ElectrombileInfoService electrombileInfoService;
	
    /**
     * @param MemberRequest
     * 新增微信用户信息
     */
	@Override
	public BaseOutDomain addMemberInfo(WeChatMember member) {
		// TODO Auto-generated method stub
		BaseOutDomain bd = new BaseOutDomain();
		MemberInfo memberInfo = new MemberInfo();
		BeanUtils.copyProperties(member, memberInfo);
		memberInfo.setCreateDate(new Date());
		memberInfo.setSubscribeTime(new Date(Long.valueOf(member.getSubscribe_time())));
		int num = memberService.insertMemberInfo(memberInfo);
		if (num > 0) {
			bd.setCode(SystemConstant.BASE_CODE_SUCCESS);
			bd.setDesc("添加成功！");
			logger.info("===============会员新增成功===============");
		}else {
			bd.setCode(SystemConstant.BASE_CODE_FAILL);
			bd.setDesc("添加失败！");
			logger.info("===============会员新增失败===============");
		}
		return bd;
	}

    /**
     * @param MemberRequest
     * 发送微信用户地理位置信息
     */
	@Override
	public BaseOutDomain sendMemberPosition(String adress) {
		// TODO Auto-generated method stub
		BaseOutDomain bd = new BaseOutDomain();
		WeChatMemberAdress memberAdress = null;
		try {
			memberAdress = (WeChatMemberAdress) XMLUtil.convertXmlStrToObject(WeChatMemberAdress.class, adress);
			bd.setCode(SystemConstant.BASE_CODE_SUCCESS);
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("===============会员地理位置对象解析失败===============");
			bd.setCode(SystemConstant.BASE_CODE_FAILL);
		}
		bd.setDesc("成功！");
		return bd;
	}

    /**
     * @param MemberRequest
     * 用户开锁
     */
	@Override
	public BaseOutDomain unlockingMobile(WeChatMember member) {
		// TODO Auto-generated method stub
		BaseOutDomain bd = new BaseOutDomain();
		
		return bd;
	}

    /**
     * @param MemberRequest
     * 用户关锁
     */
	@Override
	public BaseOutDomain colseLockMobile(WeChatMember member) {
		// TODO Auto-generated method stub
		BaseOutDomain bd = new BaseOutDomain();
		
		return bd;
	}

	@Override
	public BaseOutDomain getScopeMbilePageList(WeChatMember member) {
		// TODO Auto-generated method stub
		BaseOutDomain bd = new BaseOutDomain();
		ElectrombileInfo electro = new ElectrombileInfo();
		electro.setElectrombileLatitude(Double.valueOf(member.getLatitude()));
		electro.setElectrombileLongitude(Double.valueOf(member.getLongitude()));
		List<ElectrombileInfo> elecList = electrombileInfoService.queryScopeMbilePageList(electro);
		List<MbileInfo> mbiles = new ArrayList<MbileInfo>();
		for (ElectrombileInfo elecInfo:elecList) {
			MbileInfo mbile = new MbileInfo();
			BeanUtils.copyProperties(elecInfo, mbile);
			mbiles.add(mbile);
		}
		bd.setCode(SystemConstant.BASE_CODE_SUCCESS);
		bd.setDesc("查询成功！");
		bd.setMbiles(mbiles);
		return bd;
	}

}
