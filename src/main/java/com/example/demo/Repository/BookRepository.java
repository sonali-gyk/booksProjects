package com.example.demo.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Book;
@Repository
public interface BookRepository extends CrudRepository<Book,Serializable> {

	@Query(value="select * from book_list where author=?1", nativeQuery=true)
	public List<Book> SelectByAuthorName(String author);
	
}
