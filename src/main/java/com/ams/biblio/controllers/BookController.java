package com.ams.biblio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ams.biblio.repositories.BookRepository;
import com.ams.biblio.repositories.CategoryRepository;

@Controller
//add a paramater as the cathegory id 
@RequestMapping("/allBooks")
public class BookController {
	private final BookRepository bookRepository;
	private final CategoryRepository categoryRepository;
	
	
	

}
