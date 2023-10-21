package etienne.springframework.spring6webapp.services;

import etienne.springframework.spring6webapp.domain.Book;

/**
 * created by Etixi
 */

public interface BookService {
    Iterable<Book> findAll();
}
