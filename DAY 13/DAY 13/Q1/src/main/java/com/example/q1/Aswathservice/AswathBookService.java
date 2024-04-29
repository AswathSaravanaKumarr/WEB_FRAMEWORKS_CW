package com.example.q1.Aswathservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.Aswathmodel.AswathAuthor;
import com.example.q1.Aswathmodel.AswathBook;
import com.example.q1.Aswathrepository.AswathAuthorRepository;
import com.example.q1.Aswathrepository.AswathBookRepository;

@Service
public class AswathBookService {
    @Autowired
    private AswathBookRepository bookRepository;
@Autowired
private AswathAuthorRepository authorRepository;
    public AswathBook saveBook(Long authorId, AswathBook book) {
        AswathAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public AswathBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

