package com.ct.junit;

import java.net.URL;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



/**
 * java根据url获取json对象
 * @author openks
 * @since 2013-7-16
 * 需要添加java-json.jar才能运行
 */
public class Maptest {


	public static void main(String[] args) {  
		// lat 39.97646   
		//log 116.3039   
		String add = getAdd("121.517032", "31.273349");
		JSONObject jsonObject = JSONObject.fromObject(add);
		JSONArray jsonArray = JSONArray.fromObject(jsonObject.getString("addrList"));
		JSONObject j_2 = JSONObject.fromObject(jsonArray.get(0));
		String adress = j_2.getString("name");
		String allAdd = j_2.getString("admName");
		String arr[] = allAdd.split(",");
		System.out.println("省："+arr[0]+"\n市："+arr[1]+"\n区："+arr[2]+adress);
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
			System.out.println("error in wapaction,and e is " + e.getMessage());
		}
		System.out.println(res);
		return res;
	}
}
