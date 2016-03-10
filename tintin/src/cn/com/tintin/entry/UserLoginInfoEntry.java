package cn.com.tintin.entry;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Table;

import org.apache.ibatis.type.Alias;

import cn.com.tintin.annotation.Column;
import cn.com.tintin.annotation.History;

@History(name="USER_LOGIN_INFO_HIS")
@cn.com.tintin.annotation.Table(name="USER_LOGIN_INFO")
public class UserLoginInfoEntry  extends BaseEntry implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/** 身份证号码 */
	@Column("CARD_ID")
	private String cardId;
	/** 实名认证 */
	@Column("ID_CARD_AUTH")
	private Integer idcardAuth;
	/** 是否是借款人 0:否 1：是 */
	@Column("IS_BORROW")
	private Integer isBorrow;
	/** 开户时间 */
	@Column("JOIN_DATE")
	private Date joinDate;
	/** 邮箱认证 */
	@Column("MAIL_AUTH")
	private Integer mailAuth;
	/** 邮箱地址 */
	@Column("MAIL_ID")
	private String mailId;
	/** 设置密码 */
	@Column("PASS_WORD")
	private String passWord;
	/** 交易密码认证 */
	@Column("PAY_PASS_WORD_AUTH")
	private Integer payPassWordAuth;
	/** 手机号码 */
	@Column("PHONE")
	private String phone;
	/** 手机认证 */
	@Column("PHONE_AUTH")
	private Integer phoneAuth;
	/** 真实姓名 */
	@Column("REAL_NAME")
	private String realName;
	/** 推荐码 */
	@Column("RECOMMEND_CODE")
	private String recommendCode;
	/** 用户ID */
	@Column("USER_ID")
	private Long userId;
	/** 用户昵称 */
	@Column("USER_NAME")
	private String userName;
	/** 用户状态 */
	@Column("USER_STAT")
	private Integer userStat;
	/** VIP等级 */
	@Column("VIP_LEVEL")
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
