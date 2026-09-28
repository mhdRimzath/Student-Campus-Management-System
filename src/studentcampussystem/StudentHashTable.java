package studentcampussystem;

public class StudentHashTable {

    private class HashNode {

        String studentId;
        Student student;
        HashNode next;

        HashNode(
                String studentId,
                Student student) {

            this.studentId = studentId;
            this.student = student;
        }
    }

    private final int TABLE_SIZE = 10;

    private HashNode[] table =
            new HashNode[TABLE_SIZE];

    private int hash(
            String studentId) {

        return Math.abs(
                studentId.hashCode())
                % TABLE_SIZE;
    }

    public void put(
            Student student) {

        String id =
                student.getStudentId();

        int index = hash(id);

        HashNode newNode =
                new HashNode(
                        id,
                        student);

        newNode.next =
                table[index];

        table[index] =
                newNode;
    }

    public Student search(
        String studentId) {

    int index =
            hash(studentId);

    HashNode current =
            table[index];

    while (current != null) {

        if (current.studentId
                .equalsIgnoreCase(
                        studentId)) {

            return current.student;
        }

        current = current.next;
    }

    return null;
}

public boolean remove(
        String studentId) {

    int index =
            hash(studentId);

    HashNode current =
            table[index];

    HashNode previous = null;

    while (current != null) {

        if (current.studentId
                .equalsIgnoreCase(
                        studentId)) {

            if (previous == null) {

                table[index] =
                        current.next;

            } else {

                previous.next =
                        current.next;
            }

            return true;
        }

        previous = current;

        current = current.next;
    }

    return false;
}
}