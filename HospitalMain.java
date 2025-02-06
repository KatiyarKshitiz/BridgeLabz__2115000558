import java.util.*;
class Doctor {
String name;
Doctor(String name) {
this.name = name;
}
void consult(Patient patient) {
System.out.println("Dr. " + name + " is consulting " + patient.name);
}
}
class Patient {
String name;
Patient(String name) {
this.name = name;
}
}
public class HospitalMain {
public static void main(String[] args) {
Doctor doctor = new Doctor("Chaman");
Patient patient = new Patient("Churan");
doctor.consult(patient);
}
}
