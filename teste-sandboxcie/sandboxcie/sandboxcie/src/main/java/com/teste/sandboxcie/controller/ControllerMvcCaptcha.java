package com.teste.sandboxcie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class ControllerMvcCaptcha {
	
	@RequestMapping(method = RequestMethod.GET, path = "hcaptcha")
	public ModelAndView telaInicial() {
		
		ModelAndView m = new ModelAndView("index");
		
		return m;
		
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "recaptcha")
	public ModelAndView telaInicial2() {
		
		ModelAndView m = new ModelAndView("recaptcha");
		
		return m;
		
	}

}
