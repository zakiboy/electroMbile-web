package com.electrombile.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author admin
 *
 */
public class DateUtils {
	
	private static final String DATA_TYPE = "yyyy-MM-dd HH:mm:ss";
	
	private static final String DATA_TYPE_YYYY = "yyyy-MM-dd";
	
	private static final String DATA_END = " 00:00:00";
	
	/**
	 * @param date
	 * @return date
	 */
	public static java.sql.Date setStringToSqlDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat(DATA_TYPE);
		java.sql.Date birthDate = null;
		try {
			birthDate = new Date(sdf.parse(date + DATA_END).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return birthDate;
	}
	

	/**
	 * @param date
	 * @return date
	 */
	public static java.util.Date setStringToUtilDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat(DATA_TYPE);
		java.util.Date birthDate = null;
		try {
			birthDate = sdf.parse(date + DATA_END);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return birthDate;
	}
	
	/**
	 * @param date
	 * @return date
	 */
	public static String setUtilDateToString(java.util.Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(DATA_TYPE);
		return sdf.format(date);
	}
	
	/**
	 * @param String
	 * @return boolean
	 */
	public static boolean checkDateFormat(String date){
		SimpleDateFormat sdf = new SimpleDateFormat(DATA_TYPE_YYYY);
		boolean rt = true;
		try {
			java.util.Date birthDate = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			try {
				throw new Exception(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			rt = false;
			return rt;
		}
		return rt;
	}
}
