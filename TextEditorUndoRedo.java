import java.util.*;
class TextNode {
String content;
TextNode next, prev;
TextNode(String content) {
this.content = content;
this.next = this.prev = null;
}
}
class TextEditorLinkedList {
TextNode head, current;
void addText(String content) {
TextNode newNode = new TextNode(content);
if (head == null) {
head = current = newNode;
return;
}
current.next = newNode;
newNode.prev = current;
current = newNode;
}
void undo() {
if (current != null && current.prev != null) current = current.prev;
}
void redo() {
if (current != null && current.next != null) current = current.next;
}
void displayText() {
if (current != null) System.out.println(current.content);
}
}
public class TextEditorUndoRedo {
public static void main(String[] args) {
TextEditorLinkedList editor = new TextEditorLinkedList();
editor.addText("JAI");
editor.addText("HIND");
editor.displayText();
editor.undo();
editor.displayText();
editor.redo();
editor.displayText();
}
}
