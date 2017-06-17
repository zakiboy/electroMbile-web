package com.electrombile.model;

import java.io.Serializable;
import java.util.Date;

/**
 * MemberInfo
 *
 */
public class MemberInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**会员ID**/
	private Integer memberId;
	/**用户的昵称**/
	private String nickname;
	/**用户的标识，对当前公众号唯一**/
	private String openid;
	/**用户的性别，值为1时是男性，值为2时是女性，值为0时是未知**/
	private Integer sex;
	/**用户所在城市**/
	private String city;
	/**用户所在国家**/
	private String country;
	/**电动车ID**/
	private String province;
	/**用户所在省份**/
	private Integer subscribe;
	/**用户的语言，简体中文为zh_CN**/
	private String language;
	/**用户头像URL，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像）,用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。**/
	private String headimgurl;
	/**用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间**/
	private Date subscribeTime;
	/**只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。**/
	private Integer unionid;
	/**公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注**/
	private String remark;
	/**用户所在的分组ID（兼容旧的用户分组接口）**/
	private Integer groupid;
	/**用户被打上的标签ID列表**/
	private Integer tagidList;
	/**会员姓名**/
	private String name;
	/**会员手机号**/
	private String phone;
	/**会员邮箱**/
	private String email;
	/**出生日期**/
	private Date birthday;
	/**地址**/
	private String adress;
	/**用户状态0有效1无效**/
	private Integer status;
	/**用户创建时间*/
	private Date createDate;
	
	
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the memberId
	 */
	public Integer getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
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
	 * @return the sex
	 */
	public Integer getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
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
	 * @return the subscribe
	 */
	public Integer getSubscribe() {
		return subscribe;
	}
	/**
	 * @param subscribe the subscribe to set
	 */
	public void setSubscribe(Integer subscribe) {
		this.subscribe = subscribe;
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
	 * @return the subscribeTime
	 */
	public Date getSubscribeTime() {
		return subscribeTime;
	}
	/**
	 * @param subscribeTime the subscribeTime to set
	 */
	public void setSubscribeTime(Date subscribeTime) {
		this.subscribeTime = subscribeTime;
	}
	/**
	 * @return the unionid
	 */
	public Integer getUnionid() {
		return unionid;
	}
	/**
	 * @param unionid the unionid to set
	 */
	public void setUnionid(Integer unionid) {
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
	public Integer getGroupid() {
		return groupid;
	}
	/**
	 * @param groupid the groupid to set
	 */
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
	/**
	 * @return the tagidList
	 */
	public Integer getTagidList() {
		return tagidList;
	}
	/**
	 * @param tagidList the tagidList to set
	 */
	public void setTagidList(Integer tagidList) {
		this.tagidList = tagidList;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
