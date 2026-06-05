package pkg5.pkg6;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of integers
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements (add to the back)
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        
        // Display the queue
        System.out.println("Initial Queue: " + queue);

        // Peek the front element (view without removing)
        System.out.println("Front element is: " + queue.peek());

        // Dequeue an element (remove from the front)
        int removedElement = queue.poll();
        System.out.println("Dequeued element: " + removedElement);
        System.out.println("Queue after dequeue: " + queue);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
        
        // Emptying the queue completely to demonstrate isEmpty
        queue.poll();
        queue.poll();
        System.out.println("Is the queue empty now? " + queue.isEmpty());
    }
}