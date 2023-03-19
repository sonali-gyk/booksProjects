package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;

import com.example.demo.Repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository repo;
	
	@Override
	public Optional<Book> getBookById(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public Book add(Book s1) {
		
		return repo.save(s1);
	}

	@Override
	public List<Book> getAllBook() {
		
		return (List<Book>) repo.findAll();
	}

	@Override
	public Book updateBook(Book s1) {
		
		Long i=s1.getId();
		Book s2=repo.findById(i).get();
		s2.setCategory(s1.getCategory());
		s2.setDescription(s1.getDescription());
		return repo.save(s2);
	}

	@Override
	public String deleteBook(Integer id) {
		 
		repo.deleteById(id);
		return "Book Deleted";
	}

	@Override
	public List<Book> findByAuthorName(String author) {
		
		return (List<Book>) repo.SelectByAuthorName(author);
	}

}
