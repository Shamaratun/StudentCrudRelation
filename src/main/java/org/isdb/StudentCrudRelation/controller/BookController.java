package org.isdb.StudentCrudRelation.controller;

import java.util.List;

import org.isdb.StudentCrudRelation.dto.BookDTO;
import org.isdb.StudentCrudRelation.model.Book;
import org.isdb.StudentCrudRelation.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping
	public ResponseEntity<?> saveBook(@RequestBody BookDTO bookDTO) {
		Book saved = bookService.saveBook(bookDTO);
		return new ResponseEntity<>(saved, HttpStatus.CREATED);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Book> getBook(@PathVariable Integer id) {
		Book byId = bookService.getBook(id);
		return new ResponseEntity<>(byId, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

	@GetMapping
	public ResponseEntity<List<Book>> getAllBook() {
		List<Book> books = bookService.getAllBook();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book book) {
		Book updated = bookService.updateBook(id, book);
		return new ResponseEntity<>(updated, HttpStatus.OK);
	}
}
