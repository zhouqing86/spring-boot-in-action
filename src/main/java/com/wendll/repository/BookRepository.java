package com.wendll.repository;

import com.wendll.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String>{
    List<Book> findByReader(String reader);
}
