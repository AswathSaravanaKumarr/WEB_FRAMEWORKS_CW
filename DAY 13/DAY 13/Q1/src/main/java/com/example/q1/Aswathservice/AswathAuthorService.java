package com.example.q1.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.Aswathmodel.AswathAuthor;
import com.example.q1.Aswathrepository.AswathAuthorRepository;

@Service
public class AswathAuthorService {
    @Autowired
    private AswathAuthorRepository authorRepository;

    public AswathAuthor saveAuthor(AswathAuthor author) {
        return authorRepository.save(author);
    }

    public AswathAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<AswathAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public AswathAuthor updateAuthor(Long id, AswathAuthor author) {
        AswathAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
