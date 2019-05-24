package com.leaderment.util.entity;

/**
 * 未授权的时候抛出异常
 * @author HankJone
 * @date 2019年1月7日 10:41
 */
public class AuthorizationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String msg;

	public AuthorizationException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
