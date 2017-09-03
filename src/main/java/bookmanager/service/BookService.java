package bookmanager.service;

import bookmanager.model.Book;

import java.util.List;

/**
 * Created by София on 28.08.2017.
 */
public interface BookService {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();
}
