class Book {
String title;
String author;
double price;
Book() {
this.title = "Unknown";
this.author = "Unknown";
this.price = 0.0;
}
Book(String title, String author, double price) {
this.title = title;
this.author = author;
this.price = price;
}
public static void main(String[] args) {
Book defaultBook = new Book();
Book parameterizedBook = new Book("Java Basics", "John Doe", 299.99);
System.out.println(defaultBook.title + " by " + defaultBook.author + " - $" + defaultBook.price);
System.out.println(parameterizedBook.title + " by " + parameterizedBook.author + " - $" + parameterizedBook.price);
}
}
