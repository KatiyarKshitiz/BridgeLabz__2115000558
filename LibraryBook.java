class LibraryBook {
String title;
String author;
double price;
boolean availability;
LibraryBook(String title, String author, double price, boolean availability) {
this.title = title;
this.author = author;
this.price = price;
this.availability = availability;
}
void borrowBook() {
if (availability) {
availability = false;
System.out.println(title + " has been borrowed.");
} else {
System.out.println(title + " is not available.");
}
}
public static void main(String[] args) {
LibraryBook book = new LibraryBook("Java Basics", "John Doe", 299.99, true);
book.borrowBook();
book.borrowBook();
}
}
