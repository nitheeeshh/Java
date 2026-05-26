/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circular.doubly.linked.list;

/**
 *
 * @author nithe
 */
class CircularDoublyLinkedList {
    Node head;

    // Method to insert a node at the head (beginning)
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            // If the list is empty, the new node points to itself
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            // Find the last node (tail) which is always head.prev in a circular list
            Node tail = head.prev; 
            
            // Wire the new node to point to the current head and the tail
            newNode.next = head;
            newNode.prev = tail;
            
            // Update the existing head and tail to point to the new node
            head.prev = newNode;
            tail.next = newNode;
            
            // Shift the head pointer to the new node
            head = newNode;
        }
    }

    // Method to insert a node at the tail (end)
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            // If the list is empty, initialize it same as head insertion
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev; // Get the current last node
            
            // Wire the new node between the tail and the head
            newNode.next = head;
            newNode.prev = tail;
            
            // Update the tail's next and head's prev to include the new node
            tail.next = newNode;
            head.prev = newNode;
            
            // Note: We do NOT shift the head pointer here because it goes at the end
        }
    }

    // Method to insert a new node at a given middle position (1-based indexing)
    public void insertAtPosition(int data, int position) {
        // If inserting at position 1, redirect to insertAtHead
        if (position == 1) {
            insertAtHead(data);
            return;
        }

        Node current = head;
        int currentPosition = 1;

        // Traverse to the node just before the desired position
        // We also check to ensure we don't infinitely loop around the list
        while (currentPosition < position - 1 && current.next != head) {
            current = current.next;
            currentPosition++;
        }

        Node newNode = new Node(data);

        // Re-wire the pointers to insert the new node in the middle
        newNode.next = current.next;
        newNode.prev = current;
        
        // Update the surrounding nodes
        current.next.prev = newNode;
        current.next = newNode;
    }

    // Method to display all elements of the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        
        // Use a do-while loop because we need to process the head node 
        // before checking if we have wrapped around back to the head.
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        
        System.out.println("(HEAD)");
    }
}
