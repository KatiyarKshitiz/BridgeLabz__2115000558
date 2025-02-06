import java.util.*;
class Faculty {
String name;
Faculty(String name) {
this.name = name;
}
}
class UniversityDepartment {
List<Faculty> faculties = new ArrayList<>();
void addFaculty(Faculty faculty) {
faculties.add(faculty);
}
}
class University {
List<UniversityDepartment> departments = new ArrayList<>();
void addDepartment(UniversityDepartment department) {
departments.add(department);
}
}
public class UniversityMain {
public static void main(String[] args) {
Faculty faculty1 = new Faculty("MR. Shardul");
Faculty faculty2 = new Faculty("Ms. Krutika");
UniversityDepartment department = new UniversityDepartment();
department.addFaculty(faculty1);
department.addFaculty(faculty2);
University university = new University();
university.addDepartment(department);
for (UniversityDepartment dept : university.departments) {
for (Faculty fac : dept.faculties) {
System.out.println("Faculty: " + fac.name);
}
}
}
}
