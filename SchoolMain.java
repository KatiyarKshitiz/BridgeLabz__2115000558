import java.util.*;
class Course {
String name;
Course(String name) {
this.name = name;
}
}
class Student {
String name;
List<Course> courses = new ArrayList<>();
Student(String name) {
this.name = name;
}
void enrollInCourse(Course course) {
courses.add(course);
}
}
public class SchoolMain {
public static void main(String[] args) {
Course course1 = new Course("Math");
Course course2 = new Course("Science");
Student student = new Student("Kshitiz");
student.enrollInCourse(course1);
student.enrollInCourse(course2);
for (Course course : student.courses) {
System.out.println(student.name + " enrolled in: " + course.name);
}
}
}
