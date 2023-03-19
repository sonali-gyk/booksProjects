package com.example.demo.Model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookList")
public class Book implements Serializable{

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column
	    private String title;
	    
	    @Column
	    private String description;

	    @Column
	    private String category;

	    @Column
	    private String author_name;

	    @Column
	    private LocalDate release_date;

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getAuthorName() {
			return author_name;
		}

		public void setAuthorName(String authorName) {
			this.author_name = authorName;
		}

		public LocalDate getReleaseDate() {
			return release_date;
		}

		public void setReleaseDate(LocalDate releaseDate) {
			this.release_date = releaseDate;
		}

		

	    // getters and setters
	
}
