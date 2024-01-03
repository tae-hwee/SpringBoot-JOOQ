package com.example.demo.controller;

import com.example.demo.service.AuthorService;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@GetMapping("/api/authors/{id}")
	public ResponseEntity<String> getAuthorById(@PathVariable long id) {
		String authorName = authorService.getAuthorName(id);

		return ResponseEntity.ok().body(authorName);
	}

	@GetMapping("/api/authors")
	public ResponseEntity<Result> getAllAuthors() {
		Result authors = authorService.getAllAuthors();

		return ResponseEntity.ok().body(authors);
	}

//	@PostMapping("/api/authors")
//	public void createAuthor() {
//		authorService.createAuthor();
//	}
}
