package com.ug.common.vo;

import java.util.List;

//统一结果集  主要是针对非查询操作的数据返回  json
public class ResultVo<T> {
	private int code;//成功 1000  失败 2000
	private String msg;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public ResultVo(int code, String msg,Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public ResultVo() {
		super();
	}

	public static ResultVo setOK(String msg,Object data) {
		return new ResultVo(1000, msg, data);
	}
	public static ResultVo setERROR(String msg,Object data) {
		return new ResultVo(2000, msg, data);
	}
	

}
