import java.util.Scanner;

class CustomStack {
    private String[] arr;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    public void push(String item) {
        if (top == capacity - 1) {
            System.out.println("Error: System memory full (Stack Overflow)");
            return;
        }
        arr[++top] = item; 
    }

    public String pop() {
        if (isEmpty()) return null;
        return arr[top--]; 
    }

    public String peek() {
        if (isEmpty()) return null;
        return arr[top]; 
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public String displayAll() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(arr[i]);
            if (i < top) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}