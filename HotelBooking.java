class HotelBooking {
String guestName;
String roomType;
int nights;
HotelBooking() {
this.guestName = "Unknown";
this.roomType = "Standard";
this.nights = 1;
}
HotelBooking(String guestName, String roomType, int nights) {
this.guestName = guestName;
this.roomType = roomType;
this.nights = nights;
}
HotelBooking(HotelBooking other) {
this.guestName = other.guestName;
this.roomType = other.roomType;
this.nights = other.nights;
}
public static void main(String[] args) {
HotelBooking defaultBooking = new HotelBooking();
HotelBooking parameterizedBooking = new HotelBooking("John Doe", "Deluxe", 3);
HotelBooking copyBooking = new HotelBooking(parameterizedBooking);
System.out.println(defaultBooking.guestName + " booked " + defaultBooking.roomType + " for " + defaultBooking.nights + " nights.");
System.out.println(parameterizedBooking.guestName + " booked " + parameterizedBooking.roomType + " for " + parameterizedBooking.nights + " nights.");
System.out.println(copyBooking.guestName + " booked " + copyBooking.roomType + " for " + copyBooking.nights + " nights.");
}
}
