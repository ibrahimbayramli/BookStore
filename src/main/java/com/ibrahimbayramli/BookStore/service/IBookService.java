package com.ibrahimbayramli.BookStore.service;

import com.ibrahimbayramli.BookStore.model.Book;

import java.util.List;

public interface IBookService {


    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
