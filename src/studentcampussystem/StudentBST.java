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

    public Student search(String studentId) {

    return searchRecursive(
            root,
            studentId);
}

private Student searchRecursive(
        Node current,
        String studentId) {

    if (current == null) {

        return null;
    }

    int compare =
            studentId.compareToIgnoreCase(
                    current.student
                           .getStudentId());

    if (compare == 0) {

        return current.student;

    } else if (compare < 0) {

        return searchRecursive(
                current.left,
                studentId);

    } else {

        return searchRecursive(
                current.right,
                studentId);
    }
}

public void displayInOrder() {

    if (root == null) {

        System.out.println(
                "No students in BST.");

        return;
    }

    displayRecursive(root);
}

private void displayRecursive(
        Node current) {

    if (current != null) {

        displayRecursive(
                current.left);

        current.student.displayStudent();

        displayRecursive(
                current.right);
    }
}
}