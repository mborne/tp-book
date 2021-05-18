package io.github.mborne.services;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.github.mborne.models.Book;
import io.github.mborne.repositories.BookRepository;

@Path("/books")
public class BookService {

	private BookRepository repository = new BookRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Book> findAll() {
		return repository.findAll();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Book findById(@PathParam("id") int id) {
		return repository.find(id);
	}
}