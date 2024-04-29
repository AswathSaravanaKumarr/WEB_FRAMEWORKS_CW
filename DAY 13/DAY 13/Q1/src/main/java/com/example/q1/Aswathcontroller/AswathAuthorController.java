package com.example.q1.Aswathcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.Aswathmodel.AswathAuthor;
import com.example.q1.Aswathmodel.AswathBook;
import com.example.q1.Aswathservice.AswathAuthorService;
import com.example.q1.Aswathservice.AswathBookService;

@RestController
public class AswathAuthorController {
    @Autowired
    private AswathAuthorService authorService;
@Autowired
private AswathBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<AswathAuthor> createAuthor(@RequestBody AswathAuthor author) {
        AswathAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<AswathBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody AswathBook book) {
        AswathBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<AswathAuthor> getAuthorById(@PathVariable Long authorId) {
        AswathAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<AswathAuthor>> getAllAuthors() {
        List<AswathAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<AswathAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody AswathAuthor author) {
        AswathAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
