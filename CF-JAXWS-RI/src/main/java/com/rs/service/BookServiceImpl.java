package com.rs.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.rs.service.BookService", targetNamespace = "http://service.rs.com")
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
