class Circle {
double radius;
Circle() {
this(1.0);
}
Circle(double radius) {
this.radius = radius;
}
public static void main(String[] args) {
Circle defaultCircle = new Circle();
Circle parameterizedCircle = new Circle(5.5);
System.out.println("Default Circle Radius: " + defaultCircle.radius);
System.out.println("Parameterized Circle Radius: " + parameterizedCircle.radius);
}
}
