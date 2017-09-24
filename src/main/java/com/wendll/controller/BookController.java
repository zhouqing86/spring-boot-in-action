package com.wendll.controller;

import com.wendll.model.Book;
import com.wendll.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value = "/readers/{reader}", method = RequestMethod.GET)
    public String readerBooks(@PathVariable String reader, Model model) {
        List<Book> readerBookList = bookRepository.findByReader(reader);
        if (!StringUtils.isEmpty(readerBookList)) {
            model.addAttribute("books", readerBookList);
        }
        return "readerBooks";
    }

    @RequestMapping(value = "/readers/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable String reader, Model model, Book book) {
        book.setReader("craig");
        bookRepository.save(book);
        return "redirect:/readers/{reader}";
    }
}
