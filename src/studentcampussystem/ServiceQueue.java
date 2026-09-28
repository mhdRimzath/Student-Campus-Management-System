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

    
}