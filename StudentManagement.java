import java.util.*;
class StudentNode {
String rollNumber, name;
int age;
char grade;
StudentNode next;
StudentNode(String rollNumber, String name, int age, char grade) {
this.rollNumber = rollNumber;
this.name = name;
this.age = age;
this.grade = grade;
this.next = null;
}
}
class StudentLinkedList {
StudentNode head;
void addStudent(String rollNumber, String name, int age, char grade) {
StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
newNode.next = head;
head = newNode;
}
void deleteStudent(String rollNumber) {
StudentNode temp = head, prev = null;
if (temp != null && temp.rollNumber.equals(rollNumber)) {
head = temp.next;
return;
}
while (temp != null && !temp.rollNumber.equals(rollNumber)) {
prev = temp;
temp = temp.next;
}
if (temp == null) return;
prev.next = temp.next;
}
void searchStudent(String rollNumber) {
StudentNode temp = head;
while (temp != null) {
if (temp.rollNumber.equals(rollNumber)) {
System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
return;
}
temp = temp.next;
}
System.out.println("Student Not Found");
}
void displayStudents() {
StudentNode temp = head;
while (temp != null) {
System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
temp = temp.next;
}
}
}
public class StudentManagement {
public static void main(String[] args) {
StudentLinkedList students = new StudentLinkedList();
students.addStudent("101", "Osamam Bin Laden", 20, 'A');
students.addStudent("102", "Kim Jong Un", 21, 'B');
students.displayStudents();
students.searchStudent("101");
students.deleteStudent("102");
students.displayStudents();
}
}

