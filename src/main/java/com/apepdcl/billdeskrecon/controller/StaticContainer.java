package com.apepdcl.billdeskrecon.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ranjan
 *
 * 
 */
@Controller
@RequestMapping("/")
public class StaticContainer {

	@GetMapping("/")
	public ModelAndView getIndex(Model model) {
		return new ModelAndView("index");
	}
	
}
