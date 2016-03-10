package cn.com.tintin.entry;

import java.sql.Timestamp;

public class BaseEntry {
	
	private int version;//版本号
	
	private Timestamp createTime;//创建时间
	
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
