import java.util.*;
class SimpleHashMap {
private static final int SIZE = 10;
private LinkedList<Entry>[] table;
static class Entry {
int key, value;
Entry(int key, int value) { this.key = key; this.value = value; }
}
@SuppressWarnings("unchecked")
public SimpleHashMap() {
table = (LinkedList<Entry>[]) new LinkedList[SIZE]; 
for (int i = 0; i < SIZE; i++) table[i] = new LinkedList<>();
}
private int hash(int key) { return key % SIZE; }
public void put(int key, int value) {
int index = hash(key);
for (Entry entry : table[index]) {
if (entry.key == key) { entry.value = value; return; }
}
table[index].add(new Entry(key, value));
}
public int get(int key) {
int index = hash(key);
for (Entry entry : table[index]) {
if (entry.key == key) return entry.value;
}
return -1;
}
public void remove(int key) {
int index = hash(key);
table[index].removeIf(entry -> entry.key == key);
}
}
public class CustomHashMapUsage {
public static void main(String[] args) {
SimpleHashMap map = new SimpleHashMap();
System.out.println("Adding Pairs: (1, 100), (2, 200), (3, 300)");
map.put(1, 100);
map.put(2, 200);
map.put(3, 300);
System.out.println("Value for Key 2: " + map.get(2));
System.out.println("Removing Key 2");
map.remove(2);
System.out.println("Value for Key 2 After Deletion: " + map.get(2));
}
}
