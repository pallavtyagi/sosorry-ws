package com.sosorryservice.exception;


public class SoSorryException extends Exception{
	
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private int code;
	public SoSorryException (int code, String msg) {
		super(msg);
		this.code = code;
	}
}
