package com.electrombile.utils;

import java.util.UUID;

/**
 * @author admin
 *
 */
public class UUIDUtil {
	/**
	 * @return String
	 */
	public static String randomUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}
}
