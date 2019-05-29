package com.sarangjaiswal.JUNIT4;

public class NameNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errCode;
	
	public NameNotFoundException(int errCode, String msg) {
		super(msg);
		this.errCode = errCode;
	}

	public int getErrCode() {
		return errCode;
	}
	
	public void setErrorCode(int errCode) {
		this.errCode = errCode;
	}
}
