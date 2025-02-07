class Employee {
String name;
int id;
double salary;
Employee(String name, int id, double salary) {
this.name = name;
this.id = id;
this.salary = salary;
}
void displayDetails() {
System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
}
}
class Manager extends Employee {
int teamSize;
Manager(String name, int id, double salary, int teamSize) {
super(name, id, salary);
this.teamSize = teamSize;
}
void displayDetails() {
super.displayDetails();
System.out.println("Team Size: " + teamSize);
}
}
class Developer extends Employee {
String programmingLanguage;
Developer(String name, int id, double salary, String programmingLanguage) {
super(name, id, salary);
this.programmingLanguage = programmingLanguage;
}
void displayDetails() {
super.displayDetails();
System.out.println("Programming Language: " + programmingLanguage);
}
}
class Intern extends Employee {
int duration;
Intern(String name, int id, double salary, int duration) {
super(name, id, salary);
this.duration = duration;
}
void displayDetails() {
super.displayDetails();
System.out.println("Internship Duration: " + duration + " months");
}
}
public class EmployeeManagementSystem {
public static void main(String[] args) {
Manager manager = new Manager("Vladimir Putin", 101, 120000, 12);
Developer developer = new Developer("Osama Bin Laden", 102, 75000, "Java");
Intern intern = new Intern("Kim Jong Un", 103, 30000, 6);
manager.displayDetails();
developer.displayDetails();
intern.displayDetails();
}
}
