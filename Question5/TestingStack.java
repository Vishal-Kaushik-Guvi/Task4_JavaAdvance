package Question5;

import java.util.Scanner;
import java.util.Stack;

public class TestingStack {
    static Scanner sc = new Scanner(System.in);
    Stack<Integer> stc = new Stack<>();

// Pushing element in Stack through Scanner.
    public void pushIntoStack() {
        System.out.println("Enter the element you want to push and type 'exit' whenever you want to exit:");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting.....");
                break;
            } else {
                try {
                    int num = Integer.parseInt(input);
                    stc.push(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or 'exit' to stop.");
                }
            }
        }
        System.out.println("Elements in the stack: " + stc);
    }
// Pop the element from stack (taking input in scanner)
    public void popFromStack() {
        System.out.println("Popping elements from the stack. Enter 'exit' whenever you want to stop:");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }
// if stack is empty it will show this message
            if (stc.empty()) {
                System.out.println("Stack is Empty..");
            }
            try {
// changing input from string to Integer
                int num = Integer.parseInt(input);
                if (stc.contains(num)) {
                    stc.removeElement(num);
                    System.out.println(num + " removed from the stack.");
                    System.out.println("Elements in the stack: " + stc);
                } else {
                    System.out.println(num + " is not found in the stack.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'exit' to stop.");
            }
        }
            System.out.println("Elements in the stack: " + stc);
    }

    public static void main(String[] args) {
    // Object of main class
        TestingStack ts = new TestingStack();
           int choice;
    // giving choice to user.
    do {
      System.out.println("\n1. PUSH");
      System.out.println("2. Pop");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      sc.nextLine(); // Consume newline character

      switch (choice) {
        case 1:
        ts.pushIntoStack();
          break;
        case 2:
        ts.popFromStack();
          break;
        case 3:
          break;
        default:
          System.out.println("Invalid Choice! Please try again.");
      }
    } while (choice != 4); 
    }
}
