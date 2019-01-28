public class LinkedList {

    static class Node {
        private int data;
        private Node next;

        Node(int d) {
            data = d;
        }
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node next;

        while (head != null) {
            //storing next
            next = head.next;
            //reversing
            head.next = prev;
            //one step forward
            prev = head;
            head = next;
        }
        return prev;
    }

    private void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);

        head = list.reverse(head);

        System.out.println("\n\nReversed linked list ");
        list.printList(head);
    }
}
