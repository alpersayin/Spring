package com.bilgeadam.springrestdemo.entity;

// Hata anında bu Json'a dönücek hata anında bunu göndericem kullanıcıya.Pojo yani bu.
public class DepartmentErrorResponse { // Boş construcor,parameter constructor,getter and setters
	
	private int status;
	
	private String message;

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

	public DepartmentErrorResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public DepartmentErrorResponse() {
		
	}

}
