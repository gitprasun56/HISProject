package com.prasun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prasun.entity.AdminEntity;
import com.prasun.service.IAdminService;

@Controller
public class AdminController {
	
	@Autowired
	private IAdminService service;
	//1. Display Register page
		@RequestMapping("/register")
		public String showPage() {
			return "AdminRegister";
		}
		//2. Read Form data as ModelAttribute and save
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveData(
				@ModelAttribute AdminEntity adminEntity,
				Model model
				) 
		{
			//save data in DB
			Integer id=service.saveAdmin(adminEntity);
			//create message
			String msg="Admin '"+id+"' saved";
			//send to UI
			model.addAttribute("message", msg);
			//Goto UI Page back
			return "AdminRegister";
		}

}
