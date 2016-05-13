package cn.com.tintin.entry;

import java.sql.Timestamp;

import javax.persistence.Column;

public class BaseEntry {
	
	@Column(name="VERSION")
	private int version;//版本号
	
	@Column(name="CREATE_TIME")
	private Timestamp createTime;//创建时间
	
	@Column(name="UPDATE_TIME")
	private Timestamp updateTime;//修改时间

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
