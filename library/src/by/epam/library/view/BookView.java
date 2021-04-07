package by.epam.library.view;

import java.util.List;

import by.epam.library.entity.*;

public class BookView {

	public void print(String message, List<Book> books) {
		System.out.println(message);
		for (int i = 0; i < books.size(); i++) {

			System.out.println(books.get(i));
		}
	}
}
