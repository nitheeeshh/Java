package restaurantordercustom;

class CustomQueue {
    
    private class Node {
        String data;
        Node next;
        
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // Points to the first item (to be dequeued)
    private Node rear;  // Points to the last item (where new items are enqueued)

    public CustomQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String order) {
        Node newNode = new Node(order);
        if (this.rear == null) { // If queue is empty
            this.front = this.rear = newNode;
            return;
        }
        // Add new node to the end of queue and change rear
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public String dequeue() {
        if (isEmpty()) return null;
        
        // Store previous front and move front one node ahead
        String servedData = this.front.data;
        this.front = this.front.next;
        
        // If front becomes null, then queue is empty, so rear is also null
        if (this.front == null) {
            this.rear = null;
        }
        return servedData;
    }

    public String peek() {
        if (isEmpty()) return null;
        return this.front.data;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    // Helper method to format the output exactly like Java's built-in Queue
    public String displayAll() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Node current = front;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}