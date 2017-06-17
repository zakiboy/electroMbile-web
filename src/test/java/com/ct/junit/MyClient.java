package com.ct.junit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.net.SocketTimeoutException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.WebServiceException;

import net.sf.json.JSONObject;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class MyClient {
    public static void main(String[] args) throws Exception {
    	
//		JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
//		Client client = factory.createClient("http://localhost:8080/cxfdemo/ws/DemoService?wsdl");
//		Object[] objs = client.invoke("sayHi", "阿福");
//		System.out.println(objs[0].toString());
    	
//        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();  
//        factoryBean.setAddress("http://localhost:8080/electroMbile/cxf/helloworld");  
//        factoryBean.setServiceClass(HelloWorldService.class);  
//        Object obj = factoryBean.create();  
//  
//        HelloWorldService customerService = (HelloWorldService) obj;  
//        try {  
//            Member member = customerService.hello("123");  
//            System.out.println("Customer: " + member.getMemberName());
//            ParseJsonStr("56546");
//        } catch(Exception e) {  
//            if (e instanceof WebServiceException   
//                    && e.getCause() instanceof SocketTimeoutException) {  
//                System.err.println("This is timeout exception.");  
//            } else {  
//                e.printStackTrace();  
//            }  
//        }  
    }
    
    /** 
     * 解析xml字符串 
     *  
     * @param str传递过来的xml字符串 
     */  
    public static void parserXml(String str) {  
        try {  
            StringReader read = new StringReader(str);  
            // 创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入  
            InputSource source = new InputSource(read);  
            // 创建一个新的SAXBuilder  
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
            DocumentBuilder db = dbf.newDocumentBuilder();  
            Document document = db.parse(source);  
  
            NodeList movies = document.getChildNodes();  
            for (int i = 0; i < movies.getLength(); i++) {  
                Node employee = movies.item(i);  
                NodeList employeeInfo = employee.getChildNodes();  
                for (int j = 0; j < employeeInfo.getLength(); j++) {  
  
                    Node node = employeeInfo.item(j);  
                    if (node.getNodeType() == Node.ELEMENT_NODE) {  
                        if ("cinamaName".equals(node.getNodeName())) {  
                            System.out.println("电影名称:" + node.getTextContent());  
                        } else if ("introduce".equals(node.getNodeName())) {  
                            System.out.println("电影简介:" + node.getTextContent());  
                        } else if ("price".equals(node.getNodeName())) {  
                            System.out.println("电影价格:" + node.getTextContent());  
                        } else if ("director".equals(node.getNodeName())) {  
                            System.out.println("导演:" + node.getTextContent());  
                        }  
                    }  
                }  
            }  
        } catch (FileNotFoundException e) {  
            System.out.println(e.getMessage());  
        } catch (ParserConfigurationException e) {  
            System.out.println(e.getMessage());  
        } catch (SAXException e) {  
            System.out.println(e.getMessage());  
        } catch (IOException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
  
    public static void ParseJsonObject(JSONObject obj) {  
  
        System.out.println(obj);  
        String name = obj.getString("name");  
    }  
  
    /** 
     * 解析json字符串 
     *  
     * @param str传递过来的json字符串 
     */  
    public static void ParseJsonStr(String str) {  
  
        JSONObject obj = JSONObject.fromObject(str);  
        System.out.println(obj);  
        String name = obj.getString("name");  
        String hobby = obj.getString("hobby");  
        JSONObject message = obj.getJSONObject("message");  
        String love = message.getString("love");  
        String sex = message.getString("sex");  
        int age = message.getInt("age");  
        String englishName = message.getString("EnglishName");  
        System.out.println(hobby);  
        System.out.println(name + ">>" + hobby + ">>" + love + ">>" + sex  
                + ">>" + age + ">>" + englishName);  
    }  
}
