package etienne.springframework.spring6webapp.bootstrap;

import etienne.springframework.spring6webapp.domain.Author;
import etienne.springframework.spring6webapp.domain.Book;
import etienne.springframework.spring6webapp.domain.Publisher;
import etienne.springframework.spring6webapp.repositories.AuthorRepository;
import etienne.springframework.spring6webapp.repositories.BookRepository;
import etienne.springframework.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository,
                         BookRepository bookRepository,
                         PublisherRepository publisherRepository
    ) {

        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        Author etienne = new Author();
        etienne.setFirstName("Etienne");
        etienne.setLastName("rimbaud");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");



        Author etienneSaved = authorRepository.save(etienne);
        Book dddSaved = bookRepository.save(ddd);

        Author marine = new Author();
        marine.setFirstName("Marine");
        marine.setLastName("Verdier");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("54757585");

        Author marineSaved = authorRepository.save(marine);
        Book noEJBSaved = bookRepository.save(noEJB);

        etienneSaved.getBooks().add(dddSaved);
        marineSaved.getBooks().add(noEJBSaved);


        Publisher publisher = new Publisher();
        publisher.setPublisherName("My Publisher");
        publisher.setAddress("123 Main");
        Publisher savedPubliser = publisherRepository.save(publisher);

        dddSaved.setPublisher(savedPubliser);
        noEJB.setPublisher(savedPubliser);


        //publisherRepository.save(publisher);
        authorRepository.save(etienneSaved);
        authorRepository.save(marineSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);


        System.out.println("In Bootstrap");
        System.out.println("Author Count : " + authorRepository.count());
        System.out.println("Book Count : " + bookRepository.count());


        System.out.println("Publisher Count : " + publisherRepository.count());
    }
}
