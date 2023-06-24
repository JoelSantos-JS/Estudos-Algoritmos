package Pacote;

public class PrintList {

    private Node head;
    private Node tail;
    private int length;

    public class Node {
        public int value;
        Node next;

        Node(int value) {
            this.value = value;

        }
    }

    public PrintList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void getHead() {

        System.out.println("Header:" + head.value);
    }

    public void getTail() {
        System.out.println("Tail:" + tail.value);
    }

    public void getLength() {
        System.out.println("Length:" + length);

    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {

            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;

        }

        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;

        }

        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;

        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;

        }
        return temp;
    }

    public void pretend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;

        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;

        }

        Node temp = head;

        head = head.next;
        temp = null;

        length--;

        if (length == 0) {
            tail = null;

        }

        return temp;

    }

    public Node get(int index) {

        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }

        return temp;

    }

    public boolean set(int index, int value) {
        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;

    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            pretend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;

        }

        Node node = new Node(value);
        Node temp = get(index - 1);
        node.next = temp.next;

        temp.next = node;
        length++;
        return true;

    }

    public Node delete(int index) {

        if (index < 0 && index >= length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();

        }
        if (index == length - 1) {
            return removeLast();
        }

        Node temp = get(index - 1); // 2 = 2 -1 = 1
        Node deletedNode = temp.next; // 1 > 2

        temp.next = deletedNode.next;
        temp.next = null;
        length--;
        return deletedNode;

    }

    public void reverse() {

        // Novo primeiro
        Node temp = head;

        // Primeiro recebe o ultimo
        head = tail;

        // o ultimo recebe o novo primeiro
        tail = temp;

        Node next;
        Node prev = null;

        for (int i = 0; i < length; i++) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
    }
}
