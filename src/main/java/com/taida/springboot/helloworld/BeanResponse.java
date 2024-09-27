package com.taida.springboot.helloworld;

public class BeanResponse {

	private String message;
	
	
	//si el uso es privado hay que crear getters y setters
	public BeanResponse() {
		
	}

	public BeanResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
