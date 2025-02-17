import java.io.*;

public class LargeFileReadingComparison {
public static void main(String[] args) throws IOException {
String filePath = "largefile.txt";
long start, end;
start = System.nanoTime();
readUsingFileReader(filePath);
end = System.nanoTime();
System.out.println("FileReader Time: " + (end - start) / 1e6 + " ms");
start = System.nanoTime();
readUsingInputStreamReader(filePath);
end = System.nanoTime();
System.out.println("InputStreamReader Time: " + (end - start) / 1e6 + " ms");
}
public static void readUsingFileReader(String filePath) throws IOException {
FileReader fr = new FileReader(filePath);
while (fr.read() != -1) {}
fr.close();
}
public static void readUsingInputStreamReader(String filePath) throws IOException {
InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
while (isr.read() != -1) {}
isr.close();
}
}

