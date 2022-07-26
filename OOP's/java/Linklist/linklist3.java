package Linklist;

public class linklist3 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printlst() {
        Node n = head;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        linklist3 l = new linklist3();

        l.head = new Node(0);
        Node second = new Node(2);
        Node third = new Node(3);

        l.head.next = second;
        second.next = third;

    }

}
