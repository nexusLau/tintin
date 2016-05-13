package cn.com.tintin.entry;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="USER_LOGIN_INFO")
public class UserLoginInfoEntry  extends BaseEntry implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/** 身份证号码 */
	@Column(name="CARD_ID")
	private String cardId;
	/** 实名认证 */
	@Column(name="IDCARD_AUTH")
	private Integer idcardAuth;
	/** 是否是借款人 0:否 1：是 */
	@Column(name="IS_BORROW")
	private Integer isBorrow;
	/** 开户时间 */
	@Column(name="JOIN_DATE")
	private Date joinDate;
	/** 邮箱认证 */
	@Column(name="MAIL_AUTH")
	private Integer mailAuth;
	/** 邮箱地址 */
	@Column(name="MAIL_ID")
	private String mailId;
	/** 设置密码 */
	@Column(name="PASS_WORD")
	private String passWord;
	/** 交易密码认证 */
	@Column(name="PAY_PASS_WORD_AUTH")
	private Integer payPassWordAuth;
	/** 手机号码 */
	@Column(name="PHONE")
	private String phone;
	/** 手机认证 */
	@Column(name="PHONE_AUTH")
	private Integer phoneAuth;
	/** 真实姓名 */
	@Column(name="REAL_NAME")
	private String realName;
	/** 推荐码 */
	@Column(name="RECOMMEND_CODE")
	private String recommendCode;
	/** 用户ID */
	@Id
	@Column(name="USER_ID")
	private Long userId;
	/** 用户昵称 */
	@Column(name="USER_NAME")
	private String userName;
	/** 用户状态 */
	@Column(name="USER_STAT")
	private Integer userStat;
	/** VIP等级 */
	@Column(name="VIP_LEVEL")
	private Integer vipLevel;
	
	
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public Integer getIdcardAuth() {
		return idcardAuth;
	}
	public void setIdcardAuth(Integer idcardAuth) {
		this.idcardAuth = idcardAuth;
	}
	public Integer getIsBorrow() {
		return isBorrow;
	}
	public void setIsBorrow(Integer isBorrow) {
		this.isBorrow = isBorrow;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Integer getMailAuth() {
		return mailAuth;
	}
	public void setMailAuth(Integer mailAuth) {
		this.mailAuth = mailAuth;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Integer getPayPassWordAuth() {
		return payPassWordAuth;
	}
	public void setPayPassWordAuth(Integer payPassWordAuth) {
		this.payPassWordAuth = payPassWordAuth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getPhoneAuth() {
		return phoneAuth;
	}
	public void setPhoneAuth(Integer phoneAuth) {
		this.phoneAuth = phoneAuth;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRecommendCode() {
		return recommendCode;
	}
	public void setRecommendCode(String recommendCode) {
		this.recommendCode = recommendCode;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserStat() {
		return userStat;
	}
	public void setUserStat(Integer userStat) {
		this.userStat = userStat;
	}
	public Integer getVipLevel() {
		return vipLevel;
	}
	public void setVipLevel(Integer vipLevel) {
		this.vipLevel = vipLevel;
	}
	
	
}
