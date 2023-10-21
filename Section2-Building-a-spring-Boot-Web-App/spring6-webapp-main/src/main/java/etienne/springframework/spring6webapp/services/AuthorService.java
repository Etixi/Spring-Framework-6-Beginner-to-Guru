package etienne.springframework.spring6webapp.services;


import etienne.springframework.spring6webapp.domain.Author;

/**
 *  Created by Etienne,
 */
public interface AuthorService {

    Iterable<Author> findAll();
}
