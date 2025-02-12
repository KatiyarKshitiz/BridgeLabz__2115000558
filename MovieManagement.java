import java.util.*;

class MovieNode {
String title, director;
int year;
double rating;
MovieNode next, prev;
MovieNode(String title, String director, int year, double rating) {
this.title = title;
this.director = director;
this.year = year;
this.rating = rating;
this.next = this.prev = null;
}
}

class MovieLinkedList {
MovieNode head, tail;
void addMovie(String title, String director, int year, double rating) {
MovieNode newNode = new MovieNode(title, director, year, rating);
if (head == null) {
head = tail = newNode;
return;
}
tail.next = newNode;
newNode.prev = tail;
tail = newNode;
}
void removeMovie(String title) {
MovieNode temp = head;
while (temp != null) {
if (temp.title.equals(title)) {
if (temp.prev != null) temp.prev.next = temp.next;
if (temp.next != null) temp.next.prev = temp.prev;
if (temp == head) head = temp.next;
if (temp == tail) tail = temp.prev;
return;
}
temp = temp.next;
}
}
void displayMovies() {
MovieNode temp = head;
while (temp != null) {
System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
temp = temp.next;
}
}
}

public class MovieManagement {
public static void main(String[] args) {
MovieLinkedList movies = new MovieLinkedList();
movies.addMovie("Inception", "Nolan", 2010, 9.0);
movies.addMovie("Interstellar", "Nolan", 2014, 8.7);
movies.displayMovies();
movies.removeMovie("Inception");
movies.displayMovies();
}
}
