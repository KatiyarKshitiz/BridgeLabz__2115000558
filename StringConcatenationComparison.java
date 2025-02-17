import java.util.Random;

public class StringConcatenationComparison {
public static void main(String[] args) {
int N = 1000000;
long start, end;
start = System.nanoTime();
stringConcatenation(N);
end = System.nanoTime();
System.out.println("String Concatenation (N=" + N + "): " + (end - start) / 1e6 + " ms");
start = System.nanoTime();
stringBuilderConcatenation(N);
end = System.nanoTime();
System.out.println("StringBuilder Concatenation (N=" + N + "): " + (end - start) / 1e6 + " ms");
start = System.nanoTime();
stringBufferConcatenation(N);
end = System.nanoTime();
System.out.println("StringBuffer Concatenation (N=" + N + "): " + (end - start) / 1e6 + " ms");
}
public static void stringConcatenation(int N) {
String s = "";
for (int i = 0; i < N; i++) s += "a";
}
public static void stringBuilderConcatenation(int N) {
StringBuilder sb = new StringBuilder();
for (int i = 0; i < N; i++) sb.append("a");
}
public static void stringBufferConcatenation(int N) {
StringBuffer sb = new StringBuffer();
for (int i = 0; i < N; i++) sb.append("a");
}
}

