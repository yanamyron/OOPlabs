import java.util.Scanner;
 class LinkedListStack {
    private Node top;
    private LinkedListStack() {
        this.top = null;
    }
    private boolean isEmpty() {
        return top == null;
    }
    private void inputElements() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Введіть кількість елементів для додавання в стек: ");
         int count = scanner.nextInt();

         for (int i = 0; i < count; i++) {
             System.out.print("Введіть елемент " + (i + 1) + ": ");
             int element = scanner.nextInt();
             push(element);
         }
     }
     private void display() {
         Node current = top;
         System.out.print("Стек: ");
         while (current != null) {
             System.out.print(current.data + " ");
             current = current.next;
         }
         System.out.println();
     }
     private void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    private int pop() {
        if (isEmpty()) {
            System.out.println("Стек порожній. Неможливо вилучити елемент.");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    private static class Node {
        int data;
        Node next;
        private Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.inputElements();
        stack.display();
        System.out.println("Вилучено зі стеку: " + stack.pop());
        System.out.println("Вилучено зі стеку: " + stack.pop());
        stack.display();
    }
}
