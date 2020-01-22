package com.apepdcl.billdeskrecon.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.apepdcl.billdeskrecon.service.ReconciliationService;

/**
 * @author Ranjan
 *
 * 
 */
@Controller
@RequestMapping("/")
public class StaticContainer {
	
	@Autowired
	ReconciliationService reconService;

	@GetMapping("/")
	public ModelAndView getIndex(Model model) {
		reconService.verifyRecord("");
		return new ModelAndView("index");
	}
	
}
