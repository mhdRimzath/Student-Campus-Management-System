package studentcampussystem;

public class ActionStack {

    private class Node {

        String action;
        Node next;

        Node(String action) {
            this.action = action;
        }
    }

    private Node top;

    public void push(String action) {

        Node newNode =
                new Node(action);

        newNode.next = top;

        top = newNode;
    }

    public String pop() {

    if (top == null) {
        return null;
    }

    String action = top.action;

    top = top.next;

    return action;
}

public boolean isEmpty() {
    return top == null;
}

public void displayActions() {

    if (top == null) {

        System.out.println("No recent actions.");
        return;
    }

    Node current = top;

    while (current != null) {

        System.out.println(current.action);

        current = current.next;
    }
}
}