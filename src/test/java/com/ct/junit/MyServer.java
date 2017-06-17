package com.ct.junit;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


public class MyServer {
    private static final String address = "http://localhost:8080/electroMbile/cxf/helloworld";  
    
    public static void main(String[] args) throws Exception {
//        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
//        factoryBean.setServiceClass(HelloWorldServiceImpl.class);  
//        factoryBean.setAddress(address);
//        Server server = factoryBean.create();
//        server.start(); 
    }
    
    /** 
     * 创建JsonOBject对象 
     *  
     * @param 客户端传递的参数Name 
     * @return 返回jsonObject对象 
     */  
    public JSONObject createJsonObject(String name) {  
        JSONObject jsonObj = new JSONObject();  
        jsonObj.put("name", "liqineng");  
        String[] likes = new String[] { "music", "movie", "study" };  
        jsonObj.put("hobby", likes);  
        Map<String, String> ingredients = new HashMap<String, String>();  
        ingredients.put("age", "23");  
        ingredients.put("EnglishName", "spider man");  
        ingredients.put("sex", "boy");  
        ingredients.put("love", "tangwei");  
        jsonObj.put("message", ingredients);  
        return jsonObj;  
    }  
  
    /** 
     * 根据传递的字符串生成对应的xml。 
     *  
     * @param 传递过来的参数name 
     * @return 返回xml的字符串 
     */  
    public String createXml(String name) {  
  
        StringBuffer sb = new StringBuffer();  
        sb.append("<?xml version='1.0' encoding='UTF-8'?>");  
        sb.append("<Result>");  
        sb.append("<cinamaName>机械战警</cinamaName>");  
        sb.append("<director>" + name + "</director>");  
        sb.append("<introduce>一部好莱坞大片，3D观影，不错！！！</introduce>");  
        sb.append("<price>25</price>");  
        sb.append("</Result>");  
        return sb.toString();  
    }  
  
    public JSONObject sayJson(String str) {  
  
        return createJsonObject(str);  
    }  
  
    public String sayJsonStr(String str) {  
        return createJsonObject(str).toString();  
    }  
}
