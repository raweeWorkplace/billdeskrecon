package com.apepdcl.billdeskrecon.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
		
		return new ModelAndView("fileupload");
	}

	@PostMapping("/upload") // //new annotation since 4.3
	public String singleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		String UPLOADED_FOLDER = "F:\\temp\\";
		

		if (file.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			return "redirect:/uploadStatus";
			//return new ModelAndView("uploadStatus","message","Please select a file to upload");
		}

		try {

			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			
			Path path = Paths.get(UPLOADED_FOLDER + file.getName()+".xls");
			Files.write(path, bytes);
			reconService.verifyRecord(path.toString());
			redirectAttributes.addFlashAttribute("message",
					"You successfully uploaded '" + file.getName() + "'");
			return "redirect:/uploadStatus";
			//return new ModelAndView("uploadStatus","message","You successfully uploaded");

		} catch (IOException e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("message",
					"Exception while uploading '" + file.getName() + "'");
			return "redirect:/uploadStatus";
			//return new ModelAndView("uploadStatus","message","Exception while uploading");
		}

		
	}

	@GetMapping("/uploadStatus")
	public String uploadStatus() {
		return "uploadStatus";
	}

}
