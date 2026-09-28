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

    public boolean updateStudent(
        String id,
        String name,
        String programme,
        double marks) {

    Student student = searchStudent(id);

    if (student == null) {
        return false;
    }

    student.setName(name);
    student.setProgramme(programme);
    student.setMarks(marks);

    return true;
}

public Student deleteStudent(String id) {

    if (head == null) {
        return null;
    }

    if (head.student.getStudentId()
            .equalsIgnoreCase(id)) {

        Student deleted = head.student;
        head = head.next;

        return deleted;
    }

    Node current = head;

    while (current.next != null) {

        if (current.next.student.getStudentId()
                .equalsIgnoreCase(id)) {

            Student deleted =
                    current.next.student;

            current.next =
                    current.next.next;

            return deleted;
        }

        current = current.next;
    }

    return null;
}

public void displayAllStudents() {

    if (head == null) {

        System.out.println("No student records.");
        return;
    }

    Node current = head;

    while (current != null) {

        current.student.displayStudent();

        current = current.next;
    }
}
}