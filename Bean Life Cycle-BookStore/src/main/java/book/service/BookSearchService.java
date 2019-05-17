package book.service;

import org.springframework.beans.factory.annotation.Autowired;

import book.Book;
import book.dao.BookDao;

public class BookSearchService {

	@Autowired
	private BookDao bookDao;
	
	public BookSearchService() { }
	
	public Book searchBook(String bNum) {
		Book book = bookDao.select(bNum);
		return book;
	}
	
}
