package com.arun.app.service.impl;

import com.arun.app.beans.Book;
import com.arun.app.repository.BookRepository;
import com.arun.app.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void indexBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Page<Book> findByAuthor(String author, Pageable pageable) {
        return bookRepository.findByAuthor(author, pageable);
    }
}
