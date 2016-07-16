package com.sosorryservice.exception;



public class NotFoundException extends SoSorryException {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private int code;
	public NotFoundException (int code, String msg) {
		super(code, msg);
		this.code = code;
	}
}
