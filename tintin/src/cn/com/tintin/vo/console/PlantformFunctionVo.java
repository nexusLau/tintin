package cn.com.tintin.vo.console;

/**
 * 
 * 作者： liumaoyang
 *
 * 创建时间：2016-4-29 下午4:06:04
 * 
 * 实现功能：功能列表
 */
public class PlantformFunctionVo {
	
	private long functionId;
	
	private String functionName;
	
	private long functionParentId;
	
	private String functionUrl;
	
	

	public long getFunctionId() {
		return functionId;
	}

	public void setFunctionId(long functionId) {
		this.functionId = functionId;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public long getFunctionParentId() {
		return functionParentId;
	}

	public void setFunctionParentId(long functionParentId) {
		this.functionParentId = functionParentId;
	}

	public String getFunctionUrl() {
		return functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}
	
	
	
}
