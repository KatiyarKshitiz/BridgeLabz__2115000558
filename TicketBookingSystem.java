import java.util.*;
class TicketNode {
String ticketId, customerName, movieName, seatNumber, bookingTime;
TicketNode next;
TicketNode(String ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
this.ticketId = ticketId;
this.customerName = customerName;
this.movieName = movieName;
this.seatNumber = seatNumber;
this.bookingTime = bookingTime;
this.next = this;
}
}
class TicketReservation {
TicketNode head;
void bookTicket(String ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
TicketNode newNode = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
if (head == null) {
head = newNode;
return;
}
TicketNode temp = head;
while (temp.next != head) temp = temp.next;
temp.next = newNode;
newNode.next = head;
}
void displayTickets() {
if (head == null) return;
TicketNode temp = head;
do {
System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
temp = temp.next;
} while (temp != head);
}
}
public class TicketBookingSystem {
public static void main(String[] args) {
TicketReservation tickets = new TicketReservation();
tickets.bookTicket("T101", "Bob Marley", "Cartler", "A1", "10:00 AM");
tickets.bookTicket("T102", "Snoop Dogg", "Roll", "B2", "12:00 PM");
tickets.displayTickets();
}
}
