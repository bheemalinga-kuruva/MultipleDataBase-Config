package com.bhim.rest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhim.book.model.Book;
import com.bhim.book.repository.BookRepository;
import com.bhim.user.model.User;
import com.bhim.user.repository.UserRepository;

@RestController
public class DemoRestController {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/addData")
	public String addData2DB() {
		userRepository.saveAll(
				Stream.of(new User(744, "bheema", "bheema@gmail.com"), new User(455, "Smith", "smith@gmail.com"))
						.collect(Collectors.toList()));
		bookRepository.saveAll(Stream.of(new Book(111, "Core Java", 450.0), new Book(222, "Spring Boot", 789.90))
				.collect(Collectors.toList()));
		return "Data Added Successfully";
	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

}
