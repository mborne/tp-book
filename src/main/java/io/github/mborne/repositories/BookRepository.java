package io.github.mborne.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.github.mborne.exceptions.NotFoundException;

import io.github.mborne.models.Book;

public class BookRepository {

	private List<Book> books = new ArrayList<>();

	public BookRepository() {
		this.books.add(createFakeBook(1, "Germinal"));
		this.books.add(createFakeBook(2, "Fondation"));
	}

	private Book createFakeBook(int id, String name) {
		Book book = new Book();
		book.setId(id);
		book.setName(name);
		return book;
	}

	public Collection<Book> findAll() {
		return this.books;
	}

	public Book find(int id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		throw new NotFoundException(String.format("Book '%s' not found", id));
	}

}
