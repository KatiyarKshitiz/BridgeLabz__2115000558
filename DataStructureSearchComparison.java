import java.util.*; 
public class DataStructureSearchComparison { 
public static void main(String[] args) { 
int dataSize = 1000000; 
int searchElement = dataSize / 2; 
int[] array = new int[dataSize]; 
HashSet<Integer> hashSet = new HashSet<>(); 
TreeSet<Integer> treeSet = new TreeSet<>(); 
for (int i = 0; i < dataSize; i++) { 
array[i] = i; 
hashSet.add(i); 
treeSet.add(i); 
} 
long startTime, endTime; 
startTime = System.nanoTime(); 
boolean foundInArray = linearSearch(array, searchElement); 
endTime = System.nanoTime(); 
System.out.println("Array Search Time: " + (endTime - startTime) + " ns"); 
startTime = System.nanoTime(); 
boolean foundInHashSet = hashSet.contains(searchElement); 
endTime = System.nanoTime(); 
System.out.println("HashSet Search Time: " + (endTime - startTime) + " ns"); 
startTime = System.nanoTime(); 
boolean foundInTreeSet = treeSet.contains(searchElement); 
endTime = System.nanoTime(); 
System.out.println("TreeSet Search Time: " + (endTime - startTime) + " ns"); 
} 
public static boolean linearSearch(int[] array, int target) { 
for (int num : array) { 
if (num == target) return true; 
} 
return false; 
} 
}
