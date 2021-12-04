package partTwo;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static FixedStack f;
    private static GrowableStack g;

    private static void printMenu(int choice) {
        if (choice == 1) {
            System.out.print("\n1. Create the stack"+
                    "\n2. Push into the stack"+
                    "\n3. Pop out from the stack"+
                    "\n4. Peek the top element of the stack"+
                    "\n5. Check whether the stack is empty or not"+
                    "\n6. Check whether the stack is full or not"+
                    "\n7. Exit"+
                    "\nEnter your choice: ");
        } else if (choice == 2) {
            System.out.print("\n1. Fixed Stack"+
                    "\n2. Growable Stack"+
                    "\nWhich stack do you choose: ");
        }
    }

    // Main Method
    public static void main(String[] args) {
        boolean exit = false;
        int choice, size;
        while (!exit) {
            printMenu(1);
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("\nEnter the size for the fixed stack: ");
                    size = sc.nextInt();
                    f = new FixedStack(size);
                    g = new GrowableStack();
                    break;
                case 2:
                    push();
                    break;
                case 3:
                    pop();
                    break;
                case 4:
                    peek();
                    break;
                case 5:
                    isEmpty();
                    break;
                case 6:
                    isFull();
                    break;
                case 7:
                    exit = true;
                    break;
            }
        }
    }

    private static void push() {
        int choice, data;
        boolean result;
        printMenu(2);
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("\nEnter the data to be inserted: ");
            data = sc.nextInt();
            result = f.push(data);
            if (result)
                System.out.println("\nData successfully inserted into the stack");
            else
                System.out.println("\nError inserting data into the stack");
        } else if (choice == 2) {
            System.out.print("\nEnter the data to be inserted: ");
            data = sc.nextInt();
            result = g.push(data);
            if (result)
                System.out.println("\nData successfully inserted into the stack");
            else
                System.out.println("\nError inserting data into the stack");
        }
    }

    private static void pop() {
        int choice, result;
        printMenu(2);
        choice = sc.nextInt();
        if (choice == 1) {
            result = f.pop();
            if (result == -1)
                System.out.println("\nThe stack is empty");
            else
                System.out.println("\nThe popped element is "+ result);
        } else if (choice == 2) {
            result = g.pop();
            if (result == -1)
                System.out.println("\nThe stack is empty");
            else
                System.out.println("\nThe popped element is "+ result);
        }
    }

    private static void peek() {
        int choice;
        printMenu(2);
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("\nThe element on the top of the stack is "+ f.peek());
        } else if (choice == 2) {
            System.out.println("\nThe element on the top of the stack is "+ g.peek());
        }
    }

    private static void isEmpty() {
        int choice;
        boolean result;
        printMenu(2);
        choice = sc.nextInt();
        if (choice == 1) {
            result = f.isEmpty();
            if (result)
                System.out.println("\nThe stack is empty");
            else
                System.out.println("\nThe stack is not empty");
        } else if (choice == 2) {
            result = g.isEmpty();
            if (result)
                System.out.println("\nThe stack is empty");
            else
                System.out.println("\nThe stack is not empty");
        }
    }

    private static void isFull() {
        int choice;
        boolean result;
        printMenu(2);
        choice = sc.nextInt();
        if (choice == 1) {
            result = f.isFull();
            if (result)
                System.out.println("\nThe stack is full");
            else
                System.out.println("\nThe stack is not full");
        } else if (choice == 2) {
            result = g.isFull();
            if (result)
                System.out.println("\nThe stack is full");
            else
                System.out.println("\nThe stack is not full");
        }
    }
}
