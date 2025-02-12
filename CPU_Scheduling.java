import java.util.*;
class ProcessNode {
int id, burstTime, priority;
ProcessNode next;
ProcessNode(int id, int burstTime, int priority) {
this.id = id;
this.burstTime = burstTime;
this.priority = priority;
this.next = this;
}
}
class RoundRobinScheduler {
ProcessNode head;
void addProcess(int id, int burstTime, int priority) {
ProcessNode newNode = new ProcessNode(id, burstTime, priority);
if (head == null) {
head = newNode;
return;
}
ProcessNode temp = head;
while (temp.next != head) temp = temp.next;
temp.next = newNode;
newNode.next = head;
}
void displayProcesses() {
if (head == null) return;
ProcessNode temp = head;
do {
System.out.println(temp.id + " " + temp.burstTime + " " + temp.priority);
temp = temp.next;
} while (temp != head);
}
}
public class CPU_Scheduling {
public static void main(String[] args) {
RoundRobinScheduler scheduler = new RoundRobinScheduler();
scheduler.addProcess(1, 5, 1);
scheduler.addProcess(2, 3, 2);
scheduler.displayProcesses();
}
}
