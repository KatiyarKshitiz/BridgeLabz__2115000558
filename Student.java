class Student {
private static String universityName = "Global University";
private static int totalStudents = 0;
private final String rollNumber;
private String name;
private String grade;

public Student(String rollNumber, String name, String grade) {
this.rollNumber = rollNumber;
this.name = name;
this.grade = grade;
totalStudents++;
}

public static void displayTotalStudents() {
System.out.println("Total Students: " + totalStudents);
}

public void displayStudentDetails() {
if (this instanceof Student) {
System.out.println("Name: " + name);
System.out.println("Roll Number: " + rollNumber);
System.out.println("Grade: " + grade);
} else {
System.out.println("Invalid object type.");
}
}

public static void main(String[] args) {
Student student1 = new Student("S001", "Kshitiz", "A");
Student student2 = new Student("S002", "Prachi", "A+");
student1.displayStudentDetails();
System.out.println();
student2.displayStudentDetails();
Student.displayTotalStudents();
}
}
