package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Book;


public interface BookService {

	public Optional<Book> getBookById(Integer id);
	
	public Book add(Book s1);
	
	public List<Book> getAllBook();
	
	public Book updateBook(Book s1);
	
	public String deleteBook(Integer id);
	
	public List<Book> findByAuthorName(String author);
	
	
}
