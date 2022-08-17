package com.ibrahimbayramli.BookStore.repository;

import com.ibrahimbayramli.BookStore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {


}
