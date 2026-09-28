package studentcampussystem;

public class StudentBST {

    private class Node {

        Student student;
        Node left;
        Node right;

        Node(Student student) {
            this.student = student;
        }
    }

    private Node root;

    public void insert(Student student) {

        root = insertRecursive(
                root,
                student);
    }

    private Node insertRecursive(
            Node current,
            Student student) {

        if (current == null) {

            return new Node(student);
        }

        int compare =
                student.getStudentId()
                        .compareToIgnoreCase(
                                current.student
                                       .getStudentId());

        if (compare < 0) {

            current.left =
                    insertRecursive(
                            current.left,
                            student);

        } else if (compare > 0) {

            current.right =
                    insertRecursive(
                            current.right,
                            student);
        }

        return current;
    }
}