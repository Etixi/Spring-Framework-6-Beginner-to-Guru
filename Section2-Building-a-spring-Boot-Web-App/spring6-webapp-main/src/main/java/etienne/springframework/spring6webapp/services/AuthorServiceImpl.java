package etienne.springframework.spring6webapp.services;

import etienne.springframework.spring6webapp.domain.Author;
import etienne.springframework.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;


/**
 * Created by Etienne.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
