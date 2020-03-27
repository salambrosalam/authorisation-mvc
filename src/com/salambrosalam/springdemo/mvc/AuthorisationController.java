package com.salambrosalam.springdemo.mvc;

import javax.validation.Valid;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/authorisation")
public class AuthorisationController {
	
	
	// add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	
	
	@RequestMapping("/regForm") 
	public String regForm(Model model) { 
	    model.addAttribute("authorisation", new Authorisation()); 
	    return "authorisation-form";
		
	}

	@RequestMapping("/welcForm")
	public String welcForm(@Valid @ModelAttribute("authorisation") Authorisation theAuthorisation, 
			BindingResult theBindingResult) {
	
	System.out.println("Login: |" + theAuthorisation.getLogin() + "|");
	
	System.out.println("Password: |" + theAuthorisation.getPassword() + "|");
	
	System.out.println("Binding result: " + theBindingResult);
	
	System.out.println("/n/n/n");
		
	if (theBindingResult.hasErrors()) {
		return "authorisation-form";
	}else {	 
		return "welcome-form";
	
	}
	
}
}