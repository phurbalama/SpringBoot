package com.phurbalama.springboot.basic.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//rest service
@RestController
public class BookController {
	
	//get request
	//maps to the url, gets the value from the class
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		
		return Arrays.asList(new Book(1l,"Spring Framework","Phurba Lama"));
	}

}
