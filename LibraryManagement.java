import java.util.*;
class BookNode {
String id, title, author, genre;
boolean available;
BookNode next, prev;
BookNode(String id, String title, String author, String genre, boolean available) {
this.id = id;
this.title = title;
this.author = author;
this.genre = genre;
this.available = available;
this.next = this.prev = null;
}
}
class LibraryLinkedList {
BookNode head, tail;
void addBook(String id, String title, String author, String genre, boolean available) {
BookNode newNode = new BookNode(id, title, author, genre, available);
if (head == null) {
head = tail = newNode;
return;
}
tail.next = newNode;
newNode.prev = tail;
tail = newNode;
}
void displayBooks() {
BookNode temp = head;
while (temp != null) {
System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + (temp.available ? "Available" : "Checked Out"));
temp = temp.next;
}
}
}
public class LibraryManagement {
public static void main(String[] args) {
LibraryLinkedList library = new LibraryLinkedList();
library.addBook("B101", "1984", "George Orwell", "Fiction", true);
library.addBook("B102", "Moby Dick", "Herman Melville", "Adventure", false);
library.displayBooks();
}
}
