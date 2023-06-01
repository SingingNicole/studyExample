package com.book.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.command.BookDto;
import com.book.command.CustomerDto;
import com.book.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService bService;

	@GetMapping("/bookinfo")
	public String bookInfo(Model m) {
		List<BookDto> bookList = bService.bookInfo();
		m.addAttribute("bookList", bookList);
		return "bookinfo";
	}

	@GetMapping("/custinfo")
	public String custInfo(Model m) {
		List<CustomerDto> custList = bService.custInfo();
		m.addAttribute("custList", custList);
		return "custinfo";
	}

	@GetMapping("/searchbydate")
	public String targetDate () {
		return "searchByDate";
	}

	@PostMapping("/dateresult")
	public String searchOrderDate(@DateTimeFormat(pattern = "yyyy-MM-dd") Date searchStart, @DateTimeFormat(pattern = "yyyy-MM-dd")Date searchEnd, Model m) {
		List<Map<String, Object>> resultDate = bService.searchOrderDate(searchStart, searchEnd);
		m.addAttribute("resultDate", resultDate);
		return "searchDateResult";
	}
	
	@GetMapping("/searchbyname")
	public String targetName () {
		return "searchByName";
	}

	@PostMapping("/nameresult")
	public String searchOrderName(String name, Model m) {
		List<Map<String, Object>> resultName = bService.searchOrderName(name);
		m.addAttribute("resultName", resultName);
		m.addAttribute("name", name);
		System.out.println(resultName);
		return "searchNameResult";
	}
	
	@GetMapping("/addBook")
	public String addBook(BookDto newBook) {
		return "addbook";
	}

}
