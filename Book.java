class Book {
private static String libraryName = "City Library";
private final String isbn;
private String title;
private String author;

public Book(String isbn, String title, String author) {
this.isbn = isbn;
this.title = title;
this.author = author;
}

public static void displayLibraryName() {
System.out.println("Library Name: " + libraryName);
}

public void displayBookDetails() {
if (this instanceof Book) {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("ISBN: " + isbn);
} else {
System.out.println("Invalid object type.");
}
}

public static void main(String[] args) {
Book book1 = new Book("978-3-16-148410-0", "The Java Handbook", "Patrick Naughton");
Book book2 = new Book("978-1-4028-9462-6", "Effective Java", "Joshua Bloch");
Book.displayLibraryName();
System.out.println();
book1.displayBookDetails();
System.out.println();
book2.displayBookDetails();
}
}
