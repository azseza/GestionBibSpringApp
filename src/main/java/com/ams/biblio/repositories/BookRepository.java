package com.ams.biblio.repositories;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ams.biblio.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	@Query(value = "SELECT b FROM book WHERE  b.category_id = ?1 ")
	Collection<Book> getBookByCategoryId(int id);
	
	@Query(value = "SELECT * FROM book")
	ArrayList<?> getAllBooks();
}