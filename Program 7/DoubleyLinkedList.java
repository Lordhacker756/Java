import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        List<Integer> doublyLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Doubly Linked List Operations:");
            System.out.println("1. Add element to the beginning");
            System.out.println("2. Add element to the end");
            System.out.println("3. Add element at a specific position");
            System.out.println("4. Remove element");
            System.out.println("5. Display the list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add to the beginning: ");
                    int valueBeginning = scanner.nextInt();
                    doublyLinkedList.addFirst(valueBeginning);
                    break;
                case 2:
                    System.out.print("Enter element to add to the end: ");
                    int valueEnd = scanner.nextInt();
                    doublyLinkedList.addLast(valueEnd);
                    break;
                case 3:
                    System.out.print("Enter position to add element: ");
                    int position = scanner.nextInt();
                    System.out.print("Enter element to add: ");
                    int valuePosition = scanner.nextInt();
                    if (position >= 0 && position <= doublyLinkedList.size()) {
                        doublyLinkedList.add(position, valuePosition);
                    } else {
                        System.out.println("Invalid position");
                    }
                    break;
                case 4:
                    System.out.print("Enter element to remove: ");
                    int valueToRemove = scanner.nextInt();
                    doublyLinkedList.remove(Integer.valueOf(valueToRemove));
                    break;
                case 5:
                    System.out.println("Doubly Linked List: ");
                    ListIterator<Integer> iterator = doublyLinkedList.listIterator();
                    while (iterator.hasNext()) {
                        System.out.print(iterator.next());
                        if (iterator.hasNext()) {
                            System.out.print(" <-> ");
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
