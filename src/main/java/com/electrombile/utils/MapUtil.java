package com.electrombile.utils;

import java.net.URL;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class MapUtil {
	
	public static String getAdress(String str) {
		// lat 39.97646   
		//log 116.3039
		String[] latlog = str.split(",");
		String add = getAdd(latlog[0], latlog[1]);
		JSONObject jsonObject = JSONObject.fromObject(add);
		JSONArray jsonArray = JSONArray.fromObject(jsonObject.getString("addrList"));
		JSONObject j_2 = JSONObject.fromObject(jsonArray.get(0));
		String address = j_2.getString("admName")+j_2.getString("name");
		return address.replace(",", "").trim();
	}  

	public static String getAdd(String log, String lat ){  
		//lat 小  log  大  
		//参数解释: 纬度,经度 type 001 (100代表道路，010代表POI，001代表门址，111可以同时显示前三项)  
		String urlString = "http://gc.ditu.aliyun.com/regeocoding?l="+lat+","+log+"&type=010"; 
		String res = "";
		try {
			URL url = new URL(urlString);
			java.net.HttpURLConnection conn = (java.net.HttpURLConnection)url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream(),"UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				res += line+"\n";
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
}
