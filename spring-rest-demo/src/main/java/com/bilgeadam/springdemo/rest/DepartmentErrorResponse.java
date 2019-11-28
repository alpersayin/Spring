package com.bilgeadam.springdemo.rest;

public class DepartmentErrorResponse {

	int status;
	String message;

	public DepartmentErrorResponse() {
	}

	public DepartmentErrorResponse(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
