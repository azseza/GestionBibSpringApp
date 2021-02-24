package com.ams.biblio.services;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.biblio.repositories.BookRepository;

import com.ams.biblio.entities.Book;
//import com.ams.biblio.entities.Category;
import antlr.collections.List;

@Service("bookService")
public class BookService<book> {
	
	@Autowired
	private BookRepository bookRepo; 
	
	@Autowired Book book;
	
	public List getAllBooks(){
		return (List)bookRepo.findAll();}
	
	
	public List getBookByCatID(int cId){
		
		return (List)bookRepo.getBookByCategoryId(cId);
		
	}
	
	//Fonction pour populer le home.html 
	public List getRandomBooks() {
		ArrayList<?> allBooks;
		allBooks = (ArrayList<?>) bookRepo.getAllBooks();
		ArrayList<?> list = allBooks;
		Collections.shuffle(list);
	    List randomBooks = (List) list.subList(0, 15);
	    return randomBooks;
	}

}
