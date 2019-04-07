package com.estudo.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class PersonForm extends ActionForm{
	private static final long serialVersionUID = 671672005126856444L;
	
	private String name;
	private String email;
	
	public ActionErrors validate(ActionMapping map, 
								 HttpServletRequest req) {
        ActionErrors errors = new ActionErrors();
        if (name == null || name.length() < 1 || name.equals("") || name.length() > 5) {
            errors.add("name", new ActionMessage("error.name.required"));
 
        }
        if (email == null || email.length() < 1 || email.equals("")) {
            errors.add("email", new ActionMessage("error.email.required"));
 
        }
        return errors;
	}
	
	public PersonForm() {
	
	}
	
	public PersonForm(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
