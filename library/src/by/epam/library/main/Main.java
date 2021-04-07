package by.epam.library.main;

import by.epam.library.entity.*;
import by.epam.library.logic.*;
import by.epam.library.view.*;

import java.util.List;
/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString.Создать второй класс агрегирующий массив типа Book, с подходящими конструктарами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Book:id, название, автор(ы),издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a)список книг заданного автора;
 * б)список книг, выпущенных заданным издательством.
 * в)список кник, выпущенных после заданного года.*/

public class Main {

	public static void main(String[] args) {
		String authors;
		String publishingHouses;
		int years;

		BookList bookList = new BookList();
		BookLogic logic = new BookLogic();
		BookView view = new BookView();

		bookList.addBook(new Book(123456, "Мастер и Маргарита", "М.Булгаков", "Азбука", 2012, 480, 9.44, "Твердый"));
		bookList.addBook(new Book(123465, "Идиот", "Ф.Достоевский", "Азбука", 2010, 640, 12.50, "Твердый"));
		bookList.addBook(new Book(123478, "Доктор Живаго", "Б.Пастернак", "Азбука", 2005, 608, 8.55, "Мягкий"));
		bookList.addBook(new Book(123445, "Архипелаг ГУЛАГ", "А.Солженицын", "Алфавит", 1995, 1280, 29.33, "Твердый"));
		bookList.addBook(new Book(123356, "Война и Мир", "Л.Толстой", "Гренландия", 1990, 1408, 15.81, "Твердый"));
		bookList.addBook(new Book(123465, "Исповедь хулигана", "С.Есенин", "Гренландия", 2014, 320, 9.85, "Мягкий"));
		bookList.addBook(new Book(123465, "Двендцать стульев", "И.Ильф,Е.Петров", "Алфавит", 1998, 384, 9.85, "Мягкий"));

		authors = logic.enterFromConsole("Введите автора книги.");

		List<Book> choice;
		choice = logic.booksByAuthor(bookList.getBooks(), authors);
		view.print("Cписок книг заданного автора: ", choice);

		publishingHouses = logic.enterFromConsole("Введите название издательства.");

		choice = logic.booksByPublishingHouse(bookList.getBooks(), publishingHouses);
		view.print("Список книг, выпущенных заданным издательством: ", choice);

		years = logic.enterFromConsole2("Введите год издания.");

		choice = logic.booksByYear(bookList.getBooks(), years);
		view.print("Список кник, выпущенных после заданного года: ", choice);

	}
}
