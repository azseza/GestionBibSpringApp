package com.ams.biblio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.biblio.entities.Category;
import com.ams.biblio.repositories.CategoryRepository;

@Service("categoryService")
public class CategoryService {
	
	@Autowired
	private CategoryRepository catRepo;
	
	public List<Category> getAllCategory() {
		return catRepo.findAll();
	}
	
	
	
	

}
