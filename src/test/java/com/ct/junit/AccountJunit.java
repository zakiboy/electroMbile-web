package com.ct.junit;

import org.junit.Test;

import com.electrombile.utils.MD5Util;
import com.electrombile.utils.UUIDUtil;



/**
 * @author admin
 *
 */
public class AccountJunit {
	/**
	 * 
	 */
	@Test
	public void md5(){
		String salt = UUIDUtil.randomUUID();
		String password = MD5Util.MD5("root", salt);
		System.out.println("Password:"+password+" \t Salt:"+salt);
	}
}
