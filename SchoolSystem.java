class Person {
String name;
int age;
Person(String name, int age) {
this.name = name;
this.age = age;
}
void displayRole() {
System.out.println("Name: " + name + ", Age: " + age);
}
}
class Teacher extends Person {
String subject;
Teacher(String name, int age, String subject) {
super(name, age);
this.subject = subject;
}
void displayRole() {
super.displayRole();
System.out.println("Role: Teacher, Subject: " + subject);
}
}
class Student extends Person {
String grade;
Student(String name, int age, String grade) {
super(name, age);
this.grade = grade;
}
void displayRole() {
super.displayRole();
System.out.println("Role: Student, Grade: " + grade);
}
}
class Staff extends Person {
String department;
Staff(String name, int age, String department) {
super(name, age);
this.department = department;
}
void displayRole() {
super.displayRole();
System.out.println("Role: Staff, Department: " + department);
}
}
public class SchoolSystem {
public static void main(String[] args) {
Teacher teacher = new Teacher("Walter White", 30, "Chemistry");
Student student = new Student("Jessie Pinkman", 16, "10th Grade");
Staff staff = new Staff("Hank", 40, "Administration");
teacher.displayRole();
student.displayRole();
staff.displayRole();
}
}
