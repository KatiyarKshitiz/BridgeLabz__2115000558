import java.util.*;
class Book {
String title;
String author;
Book(String title, String author) {
this.title = title;
this.author = author;
}
}
class Library {
List<Book> books = new ArrayList<>();
void addBook(Book book) {
books.add(book);
}
List<Book> getBooks() {
return books;
}
}
public class LibraryMain {
public static void main(String[] args) {
Book book1 = new Book("Pedophile", "Drake");
Book book2 = new Book("Chemistry", "Author Walter White");
Library library = new Library();
library.addBook(book1);
library.addBook(book2);
library.getBooks().forEach(b -> System.out.println(b.title + " by " + b.author));
}
}
