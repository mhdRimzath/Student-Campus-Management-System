package studentcampussystem;

public class ServiceQueue {

    private class Node {

        ServiceRequest request;
        Node next;

        Node(ServiceRequest request) {
            this.request = request;
        }
    }

    private Node front;
    private Node rear;

    public void enqueue(
            ServiceRequest request) {

        Node newNode =
                new Node(request);

        if (rear == null) {

            front = newNode;
            rear = newNode;

        } else {

            rear.next = newNode;
            rear = newNode;
        }
    }

   public ServiceRequest dequeue() {

    if (front == null) {
        return null;
    }

    ServiceRequest request =
            front.request;

    front = front.next;

    if (front == null) {
        rear = null;
    }

    return request;
}

public boolean isEmpty() {
    return front == null;
}

public void displayQueue() {

    if (front == null) {

        System.out.println(
                "Service queue is empty.");

        return;
    }

    Node current = front;

    while (current != null) {

        System.out.println(
                current.request);

        current = current.next;
    }
} 
}