package com.estudo.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping map, 
								 ActionForm form, 
								 HttpServletRequest req, 
								 HttpServletResponse res) throws Exception {
		return map.findForward("hello");
	}
}
