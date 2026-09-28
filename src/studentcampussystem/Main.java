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
               case 1:
                    addStudent();
                    break;

                case 2:
                    updateStudent();
                    break;

                case 3:
                    deleteStudent();
                    break;

                case 4:
                    studentList.displayAllStudents();
                    break;

                case 5:
                    addServiceRequest();
                    break;

                case 6:
                    processServiceRequest();
                    break;

                case 7:
                    actionStack.displayActions();
                    break;
                
                case 8:
                    studentBST.displayInOrder();
                    break;

                case 9:
                        searchStudentUsingHash();
                        break;

                case 10:
                        addCampusLocation();
                        break;

                case 11:
                        removeCampusLocation();
                        break;

                case 12:
                        addCampusConnection();
                        break;

                case 13:
                        removeCampusConnection();
                        break;

                case 14:
                        campusGraph.displayConnections();
                        break;

                case 15:
                        traverseCampus();
                        break;
                

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

private static void addStudent() {

    System.out.print("Student ID: ");
    String id = scanner.nextLine().trim();

    if (id.isEmpty()) {

        System.out.println(
                "Student ID cannot be empty.");

        return;
    }

    if (studentList.searchStudent(id) != null) {

        System.out.println(
                "Student ID already exists.");

        return;
    }

    System.out.print("Name: ");
    String name = scanner.nextLine().trim();

    System.out.print("Programme: ");
    String programme = scanner.nextLine().trim();

    double marks;

    try {

        System.out.print("Marks: ");

        marks = Double.parseDouble(
                scanner.nextLine());

    } catch (NumberFormatException e) {

        System.out.println(
                "Invalid marks.");

        return;
    }

    if (marks < 0 || marks > 100) {

        System.out.println(
                "Marks must be between 0 and 100.");

        return;
    }

    Student student =
            new Student(
                    id,
                    name,
                    programme,
                    marks);

    if (studentList.addStudent(student)) {

        studentBST.insert(student);

        hashTable.put(student);

        actionStack.push(
                "Added student: " + id);

        System.out.println(
                "Student added successfully.");
    }
}

private static void updateStudent() {

    System.out.print("Student ID: ");
    String id = scanner.nextLine().trim();

    Student student =
            studentList.searchStudent(id);

    if (student == null) {

        System.out.println(
                "Student not found.");

        return;
    }

    System.out.print("New Name: ");
    String name = scanner.nextLine().trim();

    System.out.print("New Programme: ");
    String programme =
            scanner.nextLine().trim();

    try {

        System.out.print("New Marks: ");

        double marks =
                Double.parseDouble(
                        scanner.nextLine());

        if (marks < 0 || marks > 100) {

            System.out.println(
                    "Marks must be between 0 and 100.");

            return;
        }

        if (studentList.updateStudent(
                id,
                name,
                programme,
                marks)) {

            hashTable.put(student);

            actionStack.push(
                    "Updated student: " + id);

            System.out.println(
                    "Student updated successfully.");
        }

    } catch (NumberFormatException e) {

        System.out.println(
                "Invalid marks.");
    }
}

private static void deleteStudent() {

    System.out.print("Student ID: ");

    String id =
            scanner.nextLine().trim();

    Student deleted =
            studentList.deleteStudent(id);

    if (deleted == null) {

        System.out.println(
                "Student not found.");

        return;
    }

    hashTable.remove(id);

    actionStack.push(
            "Deleted student: " + id);

    System.out.println(
            "Student deleted successfully.");
}

private static void addServiceRequest() {

    System.out.print(
            "Student ID: ");

    String studentId =
            scanner.nextLine().trim();

    Student student =
            studentList.searchStudent(
                    studentId);

    if (student == null) {

        System.out.println(
                "Student does not exist.");

        return;
    }

    System.out.print(
            "Service Request: ");

    String request =
            scanner.nextLine().trim();

    if (request.isEmpty()) {

        System.out.println(
                "Request cannot be empty.");

        return;
    }

    ServiceRequest serviceRequest =
            new ServiceRequest(
                    studentId,
                    request);

    serviceQueue.enqueue(
            serviceRequest);

    actionStack.push(
            "Added service request for "
            + studentId);

    System.out.println(
            "Service request added.");
}

private static void processServiceRequest() {

    ServiceRequest request =
            serviceQueue.dequeue();

    if (request == null) {

        System.out.println(
                "No service requests.");

        return;
    }

    System.out.println(
            "Processing: " + request);

    actionStack.push(
            "Processed request for "
            + request.getStudentId());
}

private static void searchStudentUsingHash() {

    System.out.print(
            "Enter Student ID: ");

    String id =
            scanner.nextLine().trim();

    Student student =
            hashTable.search(id);

    if (student == null) {

        System.out.println(
                "Student not found.");

    } else {

        System.out.println(
                "Student found:");

        student.displayStudent();
    }
}

private static void addCampusLocation() {

    System.out.print(
            "Location Name: ");

    String location =
            scanner.nextLine().trim();

    if (location.isEmpty()) {

        System.out.println(
                "Location cannot be empty.");

        return;
    }

    campusGraph.addLocation(location);
}

private static void removeCampusLocation() {

    System.out.print(
            "Location Name: ");

    String location =
            scanner.nextLine().trim();

    if (location.isEmpty()) {

        System.out.println(
                "Location cannot be empty.");

        return;
    }

    campusGraph.removeLocation(location);
}

private static void addCampusConnection() {

    System.out.print(
            "First Location: ");

    String first =
            scanner.nextLine().trim();

    System.out.print(
            "Second Location: ");

    String second =
            scanner.nextLine().trim();

    if (first.isEmpty()
            || second.isEmpty()) {

        System.out.println(
                "Location names cannot be empty.");

        return;
    }

    campusGraph.addConnection(
            first,
            second);
}

private static void removeCampusConnection() {

    System.out.print(
            "First Location: ");

    String first =
            scanner.nextLine().trim();

    System.out.print(
            "Second Location: ");

    String second =
            scanner.nextLine().trim();

    if (first.isEmpty()
            || second.isEmpty()) {

        System.out.println(
                "Location names cannot be empty.");

        return;
    }

    campusGraph.removeConnection(
            first,
            second);
}

private static void traverseCampus() {

    System.out.print(
            "Starting Location: ");

    String start =
            scanner.nextLine().trim();

    if (start.isEmpty()) {

        System.out.println(
                "Starting location cannot be empty.");

        return;
    }

    campusGraph.bfs(start);
}


    
}