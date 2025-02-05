class Patient {
private static String hospitalName = "City Hospital";
private static int totalPatients = 0;
private final String patientID;
private String name;
private int age;
private String ailment;

public Patient(String patientID, String name, int age, String ailment) {
this.patientID = patientID;
this.name = name;
this.age = age;
this.ailment = ailment;
totalPatients++;
}

public static int getTotalPatients() {
return totalPatients;
}

public void displayPatientDetails() {
if (this instanceof Patient) {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Ailment: " + ailment);
System.out.println("Patient ID: " + patientID);
} else {
System.out.println("Invalid object type.");
}
}

public static void main(String[] args) {
Patient patient1 = new Patient("P001", "Prachi", 30, "Fever");
Patient patient2 = new Patient("P002", "Kshitiz", 45, "Diabetes");
patient1.displayPatientDetails();
System.out.println();
patient2.displayPatientDetails();
System.out.println("\nTotal Patients: " + getTotalPatients());
}
}
