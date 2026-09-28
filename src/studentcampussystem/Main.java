package studentcampussystem;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner =
            new Scanner(System.in);

    private static final StudentLinkedList studentList =
            new StudentLinkedList();

    private static final ActionStack actionStack =
            new ActionStack();

    private static final ServiceQueue serviceQueue =
            new ServiceQueue();

    private static final StudentBST studentBST =
            new StudentBST();

    private static final StudentHashTable hashTable =
            new StudentHashTable();

    private static final CampusGraph campusGraph =
            new CampusGraph();

    public static void main(String[] args) {

        int choice = 0;

        do {

            displayMenu();

            System.out.print("\nEnter your choice: ");

            try {

                choice = Integer.parseInt(
                        scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number.");

                continue;
            }

            switch (choice) {

                

                case 16:
                    System.out.println(
                            "Exiting system...");
                    break;

                default:
                    System.out.println(
                            "Invalid menu option.");
            }

        } while (choice != 16);

        scanner.close();
    }

    private static void displayMenu() {

        System.out.println(
                "\n==========================================");

        System.out.println(
                " UNIVERSITY STUDENT & CAMPUS ROUTE SYSTEM");

        System.out.println(
                "==========================================");

        System.out.println("1. Add Student Record");
        System.out.println("2. Update Student Record");
        System.out.println("3. Delete Student Record");
        System.out.println(
                "4. Display All Records using Linked List");

        System.out.println(
                "5. Add Service Request to Queue");

        System.out.println(
                "6. Process Next Service Request");

        System.out.println(
                "7. Display Recent Actions using Stack");

        System.out.println(
                "8. Display Students using BST");

        System.out.println(
                "9. Search Student using Hashing");

        System.out.println(
                "10. Add Campus Location");

        System.out.println(
                "11. Remove Campus Location");

        System.out.println(
                "12. Add Campus Connection/Road");

        System.out.println(
                "13. Remove Campus Connection/Road");

        System.out.println(
                "14. Display Campus Connections");

        System.out.println(
                "15. Traverse Campus Locations using BFS");

        System.out.println("16. Exit");
    }

    
}