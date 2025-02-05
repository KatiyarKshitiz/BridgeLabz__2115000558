class Employee {
private static String companyName = "Tech Solutions Inc.";
private static int totalEmployees = 0;
private final String id;
private String name;
private String designation;

public Employee(String id, String name, String designation) {
this.id = id;
this.name = name;
this.designation = designation;
totalEmployees++;
}

public static void displayTotalEmployees() {
System.out.println("Total Employees: " + totalEmployees);
}

public void displayEmployeeDetails() {
if (this instanceof Employee) {
System.out.println("Name: " + name);
System.out.println("ID: " + id);
System.out.println("Designation: " + designation);
} else {
System.out.println("Invalid object type.");
}
}

public static void main(String[] args) {
Employee emp1 = new Employee("E001", "Kshitiz", "Software Engineer");
Employee emp2 = new Employee("E002", "Prachi", "Project Manager");
emp1.displayEmployeeDetails();
System.out.println();
emp2.displayEmployeeDetails();
System.out.println();
Employee.displayTotalEmployees();
}
}
