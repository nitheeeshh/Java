
package circular.doubly.linked.list;
public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        // 1. Insert elements 20 and 10 at the head
        list.insertAtHead(20);
        list.insertAtHead(10); 
        // Current list: 10 <-> 20

        // 2. Insert element 40 at the tail
        list.insertAtTail(40); 
        // Current list: 10 <-> 20 <-> 40

        // 3. Insert element 30 at position 3
        list.insertAtPosition(30, 3); 
        // Final list: 10 <-> 20 <-> 30 <-> 40

        // 4. Display the final circular doubly linked list
        list.display();
    }
}