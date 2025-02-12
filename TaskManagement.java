import java.util.*;
class TaskNode {
int id, priority;
String name, dueDate;
TaskNode next;
TaskNode(int id, String name, int priority, String dueDate) {
this.id = id;
this.name = name;
this.priority = priority;
this.dueDate = dueDate;
this.next = this;
}
}
class TaskScheduler {
TaskNode head;
void addTask(int id, String name, int priority, String dueDate) {
TaskNode newNode = new TaskNode(id, name, priority, dueDate);
if (head == null) {
head = newNode;
return;
}
TaskNode temp = head;
while (temp.next != head) temp = temp.next;
temp.next = newNode;
newNode.next = head;
}
void displayTasks() {
if (head == null) return;
TaskNode temp = head;
do {
System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
temp = temp.next;
} while (temp != head);
}
}
public class TaskManagement {
public static void main(String[] args) {
TaskScheduler scheduler = new TaskScheduler();
scheduler.addTask(1, "Task1", 1, "2024-02-20");
scheduler.addTask(2, "Task2", 2, "2024-02-21");
scheduler.displayTasks();
}
}
