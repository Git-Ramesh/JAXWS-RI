package com.rs.service;

import javax.jws.WebService;

import com.rs.model.Book;

@WebService(endpointInterface = "com.rs.service.BookService")
public class BookServiceImpl implements BookService {

	@Override
	public Book registerBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book searchBook(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

}
