package com.DevToolsBoot.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DevToolsBoot.Entity.Book;
import com.DevToolsBoot.Services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService BS;
	
	@GetMapping("/books")
	public List<Book> getbooks() {
		return this.BS.getallBooks();
	}
	
	@GetMapping("/books1")
	public ResponseEntity<List<Book>> getbooks1() {
		List<Book>L2=this.BS.getallBooks();
		if(L2.size()==0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(L2));
	}
	
	@GetMapping("/books/{id1}")
	public Book getbyid(@PathVariable("id1") int id) {
		return this.BS.getbyid(id);
	}
	
	@GetMapping("/bookss")
	public Book getbyid2(@RequestParam(name = "id1", required = false) int id) {
		return this.BS.getbyid(id);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book b) {
		return this.BS.addbook(b);
		
	}
	
	
	@DeleteMapping("/books/{id2}")
	public String  delB(@PathVariable("id2") int id) {
		String g=this.BS.deletebook(id);
		return g;
	}

	@GetMapping("/Book")
	public String test() {
		String S=this.BS.TestJ();
		return S;
		
	}
	
	@PutMapping("/books/{id}")
	public Book UpdateBook(@RequestBody Book b,@PathVariable("id") int id) { 
		
		return this.BS.update(b);
		
	}
	
//	@GetMapping("/books/{ids}")
//	public Book Getmultiple(@PathVariable("ids") String id) { 
//		List<String> ids = Arrays.asList(id.split(","));
//		this.BS.getbyids(ids);
//		
//	}
	
}
