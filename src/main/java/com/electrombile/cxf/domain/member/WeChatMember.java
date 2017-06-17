package com.electrombile.cxf.domain.member;

import java.io.Serializable;

public class WeChatMember implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String subscribe;//用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
	private String openid;//用户的标识，对当前公众号唯一
	private String nickname;//用户的昵称
	private String sex;//用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
	private String city;//用户所在城市
	private String country;//用户所在国家
	private String province;//用户所在省份
	private String language;//用户的语言，简体中文为zh_CN
	//用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），
	//用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
	private String headimgurl;
	private String subscribe_time;//用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
	private String unionid;//只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
	private String remark;//公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
	private String groupid;//用户所在的分组ID（兼容旧的用户分组接口）
	private String tagid_list;//用户被打上的标签ID列表
	private String latitude;//地理位置纬度
	private String longitude;//地理位置经度
	private String precision;//地理位置精度
	

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the precision
	 */
	public String getPrecision() {
		return precision;
	}
	/**
	 * @param precision the precision to set
	 */
	public void setPrecision(String precision) {
		this.precision = precision;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @return the subscribe
	 */
	public String getSubscribe() {
		return subscribe;
	}
	/**
	 * @param subscribe the subscribe to set
	 */
	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the openid
	 */
	public String getOpenid() {
		return openid;
	}
	/**
	 * @param openid the openid to set
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the headimgurl
	 */
	public String getHeadimgurl() {
		return headimgurl;
	}
	/**
	 * @param headimgurl the headimgurl to set
	 */
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	/**
	 * @return the subscribe_time
	 */
	public String getSubscribe_time() {
		return subscribe_time;
	}
	/**
	 * @param subscribe_time the subscribe_time to set
	 */
	public void setSubscribe_time(String subscribe_time) {
		this.subscribe_time = subscribe_time;
	}
	/**
	 * @return the unionid
	 */
	public String getUnionid() {
		return unionid;
	}
	/**
	 * @param unionid the unionid to set
	 */
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the groupid
	 */
	public String getGroupid() {
		return groupid;
	}
	/**
	 * @param groupid the groupid to set
	 */
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	/**
	 * @return the tagid_list
	 */
	public String getTagid_list() {
		return tagid_list;
	}
	/**
	 * @param tagid_list the tagid_list to set
	 */
	public void setTagid_list(String tagid_list) {
		this.tagid_list = tagid_list;
	}

}
