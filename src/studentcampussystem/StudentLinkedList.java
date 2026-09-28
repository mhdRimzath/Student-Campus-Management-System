package studentcampussystem;

public class StudentLinkedList {

    private class Node {

        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
        }
    }

    private Node head;

    public boolean addStudent(Student student) {

        if (searchStudent(student.getStudentId()) != null) {

            System.out.println("Student ID already exists.");
            return false;
        }

        Node newNode = new Node(student);

        if (head == null) {

            head = newNode;

        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        return true;
    }

    public Student searchStudent(String id) {

        Node current = head;

        while (current != null) {

            if (current.student.getStudentId()
                    .equalsIgnoreCase(id)) {

                return current.student;
            }

            current = current.next;
        }

        return null;
    }
}