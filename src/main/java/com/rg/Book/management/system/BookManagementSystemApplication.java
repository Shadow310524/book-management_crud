package com.rg.Book.management.system;

import com.rg.Book.management.system.model.Books;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookManagementSystemApplication.class, args);
//		Books books=new Books(1,"Shadow","Harish","123","456");
//		System.out.println(books.toString());
//		If you have any lombok doubt visit this
//		https://www.youtube.com/watch?v=cGfXHXTQw98
	}

}
