package cn.com.tintin.vo;

import java.io.Serializable;

/**
 * 返回用结果集
 * @author Cloud
 *
 */
public class ResultVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**编码*/
	private String resCode;
	/**标志位*/
	private boolean flag;
	/**返回数据*/
	private Object resData;
	
	
	
	
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Object getResData() {
		return resData;
	}
	public void setResData(Object resData) {
		this.resData = resData;
	}
	
	

}
