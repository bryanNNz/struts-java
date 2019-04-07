package com.estudo.struts;

import org.apache.struts.action.ActionForm;

import com.estudo.domain.Hello;

public class HelloForm extends ActionForm{

	private static final long serialVersionUID = 6043974505929176069L;
	
	private Hello hello;
	
	public HelloForm() {
		hello = new Hello();
	}

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}
	
}
