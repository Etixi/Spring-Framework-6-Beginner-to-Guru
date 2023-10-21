package etienne.springframework.spring6webapp.services;

import etienne.springframework.spring6webapp.domain.Book;
import etienne.springframework.spring6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;


/**
 * Created by Etixi
 */

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
