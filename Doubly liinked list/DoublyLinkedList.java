package doubly.linked.list;
class DoublyLinkedList {
    Node head;
    Node tail;

    // Method to insert elements at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to insert a new node at a given position (1-based indexing)
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // Edge case: Inserting at the beginning (Position 1)
        if (position == 1) {
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            return;
        }

        Node current = head;
        int currentPosition = 1;

        // Traverse to the node just before the desired position
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        // If the position is out of bounds
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Re-wire the pointers to insert the new node
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode; // Link the next node back to the new node
        } else {
            tail = newNode; // If inserted at the very end, update the tail
        }
        
        current.next = newNode; // Link the previous node forward to the new node
    }

    // Method to display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}