package com.electrombile.cxf.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.electrombile.cxf.domain.mbile.MbileInfo;
import com.electrombile.cxf.domain.order.OrderBack;

@XmlRootElement
@XmlSeeAlso({OrderBack.class})
public class BaseOutDomain {
    private int code;
    private String desc;
    private Object result;
    private List<String> list;
    private List<MbileInfo> mbiles;
    

    /**
     * 获取code属性的值。
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * 获取desc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置desc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResult(Object value) {
        this.result = value;
    }

	/**
	 * @return the list
	 */
	public List<String> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<String> list) {
		this.list = list;
	}

	/**
	 * @return the mbiles
	 */
	public List<MbileInfo> getMbiles() {
		return mbiles;
	}

	/**
	 * @param mbiles the mbiles to set
	 */
	public void setMbiles(List<MbileInfo> mbiles) {
		this.mbiles = mbiles;
	}

}
