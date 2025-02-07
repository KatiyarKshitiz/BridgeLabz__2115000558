class Animal{
String name;
int age;
public Animal(String name, int age){
this.name = name;
this.age = age;
}
public void makeSound(){
System.out.println("Animals make Sounds");
}
}
class Dog extends Animal{
public Dog(String name, int age){
super(name, age);
}
public void makeSound(){
System.out.println(name +" Barks: woof woof at age " + age);
}
}
class Cat extends Animal{
public Cat(String name, int age){
super(name, age);
}
public void makeSound(){
System.out.println(name +" Meows: meow meow at age " + age);
}
}
class Bird extends Animal{
public  Bird(String name, int age){
super(name, age);
}
public void makeSound(){
System.out.println(name+" Chirps: Tweet Tweet at age " + age);
}
}
public class AnimalHierarchy{
public static void main(String[]args){
Animal myDog= new Dog("Whiskey", 3);
Animal myCat = new Cat("Keo", 2);
Animal myBird = new Bird("Leo", 1);
myDog.makeSound();
myCat.makeSound();
myBird.makeSound();
}
}
