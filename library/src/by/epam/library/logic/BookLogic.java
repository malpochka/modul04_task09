package by.epam.library.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.epam.library.entity.*;

public class BookLogic {

	public String enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextLine()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextLine();
	}

	public List<Book> booksByAuthor(List<Book> books, String z) {
		List<Book> authorOfBook = new ArrayList<Book>();
		authorOfBook.addAll(books);

		List<Book> authorOfBooks = new ArrayList<Book>();

		for (int i = 0; i < authorOfBook.size(); i++) {
			if (authorOfBook.get(i).getAuthor().equalsIgnoreCase(z)) {
				authorOfBooks.add(books.get(i));
			}
		}
		return authorOfBooks;
	}

	public List<Book> booksByPublishingHouse(List<Book> books, String z) {
		List<Book> publishingHouseOfBook = new ArrayList<Book>();
		publishingHouseOfBook.addAll(books);

		List<Book> publishingHouseOfBooks = new ArrayList<Book>();

		for (int i = 0; i < publishingHouseOfBook.size(); i++) {
			if (publishingHouseOfBook.get(i).getPublishingHouse().equalsIgnoreCase(z)) {
				publishingHouseOfBooks.add(books.get(i));
			}
		}
		return publishingHouseOfBooks;
	}

	public int enterFromConsole2(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextInt();
	}

	public List<Book> booksByYear(List<Book> books, int z) {
		List<Book> yaerOfBook = new ArrayList<Book>();
		yaerOfBook.addAll(books);

		List<Book> yaerOfBooks = new ArrayList<Book>();

		for (int i = 0; i < yaerOfBook.size(); i++) {
			if (yaerOfBook.get(i).getYear() > z) {
				yaerOfBooks.add(books.get(i));
			}
		}
		return yaerOfBooks;
	}
}
