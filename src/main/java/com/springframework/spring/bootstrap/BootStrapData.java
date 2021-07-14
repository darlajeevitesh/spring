package com.springframework.spring.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.spring.domain.Author;
import com.springframework.spring.domain.Book;
import com.springframework.spring.domain.Publisher;
import com.springframework.spring.repositories.AuthorRespository;
import com.springframework.spring.repositories.BookRepository;
import com.springframework.spring.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRespository authorRepository;
	private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

	public BootStrapData(AuthorRespository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}





	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Started in BootStrap");
		
		Publisher publisher = new Publisher();
		publisher.setName("XYZ Publishing");
		publisher.setCity("Vijayawada");
		publisher.setState("AP");
		//publisher.setZip("520001");
		
		publisherRepository.save(publisher);
		
        System.out.println("Publisher Count: " + publisherRepository.count());

		
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book( "Domain Driven Design", "121313");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);
		
		authorRepository.save(eric); 
		bookRepository.save(ddd);
		publisherRepository.save(publisher);

		
		Author rod = new Author("Rod", "Jhonson");
		Book noEJB = new Book( "J2EE Development without EJB ", "6546889");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		noEJB.setPublisher(publisher);
        publisher.getBooks().add(ddd);

		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		publisherRepository.save(publisher);

		
		System.out.println("Number of Books : "+bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());


		
	}
	
	

}
