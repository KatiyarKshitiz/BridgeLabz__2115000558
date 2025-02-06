import java.util.*;
class Professor {
String name;
Professor(String name) {
this.name = name;
}
}
class Course {
String name;
Course(String name) {
this.name = name;
}
}
class UniversityManagementStudent {
String name;
List<Course> courses = new ArrayList<>();
UniversityManagementStudent(String name) {
this.name = name;
}
void enrollCourse(Course course) {
courses.add(course);
}
}
public class UniversityManagementMain {
public static void main(String[] args) {
Professor professor = new Professor("Mr. Ashutosh");
Course course = new Course("Java");
UniversityManagementStudent student = new UniversityManagementStudent("Kshitiz");
student.enrollCourse(course);
System.out.println(student.name + " enrolled in: " + course.name);
System.out.println(professor.name + " teaches: " + course.name);
}
}
