package com.springframework.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.spring.repositories.AuthorRespository;

@Controller
public class AuthorController {
	
	private final AuthorRespository authorRepository;

	public AuthorController(AuthorRespository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model)
	{
		model.addAttribute("authors", authorRepository.findAll());
		return "authors/list";
		
	}
	
	

}
