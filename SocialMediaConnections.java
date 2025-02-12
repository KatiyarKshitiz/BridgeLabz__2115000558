import java.util.*;
class FriendNode {
String userId, name;
List<String> friends;
FriendNode next;
FriendNode(String userId, String name) {
this.userId = userId;
this.name = name;
this.friends = new ArrayList<>();
this.next = null;
}
}
class SocialMediaLinkedList {
FriendNode head;
void addUser(String userId, String name) {
FriendNode newNode = new FriendNode(userId, name);
newNode.next = head;
head = newNode;
}
void displayUsers() {
FriendNode temp = head;
while (temp != null) {
System.out.println(temp.userId + " " + temp.name + " Friends: " + temp.friends);
temp = temp.next;
}
}
}
public class SocialMediaConnections {
public static void main(String[] args) {
SocialMediaLinkedList social = new SocialMediaLinkedList();
social.addUser("U101", "Dholu");
social.addUser("U102", "Bholu");
social.displayUsers();
}
}

