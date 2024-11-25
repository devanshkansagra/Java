class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class CircularDoublyLinkedList {
    private Node head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void display() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public void delete(int data) {
        if (head == null) return;

        Node current = head;
        do {
            if (current.data == data) {
                if (current == head && current.next == head) {
                    head = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    if (current == head) {
                        head = current.next;
                    }
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.print("Circular Doubly Linked List: ");
        list.display();

        list.delete(20);
        System.out.print("After deleting 20: ");
        list.display();
    }
}
