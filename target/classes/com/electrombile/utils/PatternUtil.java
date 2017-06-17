package com.electrombile.utils;

/**
 * @author admin
 *
 */
public class PatternUtil {
	private final static String REQUEST_MAPPING_REGEX="[\\\\|/]+";
	
	private final static String REQUEST_MAPPING_PATH_REGEX="(\\{\\w+\\})";
	
	/**
	 * @param url
	 * @return String
	 */
	public static String resourceKey(String url){
		url = url.replaceAll(REQUEST_MAPPING_REGEX, ".");
		if(url.startsWith(".")){
			url = url.replaceFirst(".", "");
		}
		return url.replaceAll(REQUEST_MAPPING_PATH_REGEX, "*");
	}
	
	/**
	 * @param url
	 * @return String
	 */
	public static String resourcePattern(String url){
		url = url.replaceAll(REQUEST_MAPPING_REGEX, "/");
		if(!url.startsWith("/")){
			url = "/"+url;
		}
		return url.replaceAll(REQUEST_MAPPING_PATH_REGEX, "*");
	}
	
}
