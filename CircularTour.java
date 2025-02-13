import java.util.*;
class PetrolPump {
int petrol;
int distance;
PetrolPump(int petrol, int distance) {
this.petrol = petrol;
this.distance = distance;
}
}
class CircularTourFinder {
public static int findStartingPoint(PetrolPump[] pumps) {
int start = 0, deficit = 0, surplus = 0;
for (int i = 0; i < pumps.length; i++) {
surplus += pumps[i].petrol - pumps[i].distance;
if (surplus < 0) {
start = i + 1;
deficit += surplus;
surplus = 0;
}
}
return (surplus + deficit >= 0) ? start : -1;
}
}
public class CircularTour {
public static void main(String[] args) {
PetrolPump[] pumps = {
new PetrolPump(4, 6),
new PetrolPump(6, 5),
new PetrolPump(7, 3),
new PetrolPump(4, 5)
};
System.out.println("Petrol Pumps Data:");
for (int i = 0; i < pumps.length; i++) {
System.out.println("Pump " + (i + 1) + " - Petrol: " + pumps[i].petrol + ", Distance: " + pumps[i].distance);
}
int startIndex = CircularTourFinder.findStartingPoint(pumps);
System.out.println("Starting Point for Circular Tour: " + (startIndex == -1 ? "Not Possible" : "Pump " + (startIndex + 1)));
}
}
