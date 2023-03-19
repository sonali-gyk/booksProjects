package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/getAllBook")
	public ResponseEntity<List<Book>> getAll()
	{
		return ResponseEntity.ok().body(service.getAllBook());
	}
	
	@GetMapping("getById/{id}")
	public ResponseEntity<Optional<Book>> getBookById(@PathVariable("id") Integer id)
	{
		return ResponseEntity.ok().body(service.getBookById(id));
	}
	
	@GetMapping("/getByAuthorName/{name}")
	public ResponseEntity<List<Book>> byAuthorName(@PathVariable("name") String name)
	{
		return ResponseEntity.ok().body(service.findByAuthorName(name));
	}
	
	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@RequestBody Book book)
	{
		return ResponseEntity.ok().body(service.add(book));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable("id") Integer id)
	{
		return ResponseEntity.ok().body(service.deleteBook(id));
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Book> updateBook(@RequestBody Book book)
	{
		return ResponseEntity.ok().body(service.updateBook(book));
	}

}
