package com.apepdcl.billdeskrecon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		return new ModelAndView("index");
	}

	@PostMapping("/upload") // //new annotation since 4.3
	public String singleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		if (file.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			return "redirect:/";
		}
		List<String> responseList = reconService.verifyRecord(file);
		if (!responseList.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "File successfully processed ");
			redirectAttributes.addFlashAttribute("list",responseList );
		} else {
			redirectAttributes.addFlashAttribute("message", "Something went wrong while processing.\n Contact Admin");
		}
		return "redirect:/";

	}
}
