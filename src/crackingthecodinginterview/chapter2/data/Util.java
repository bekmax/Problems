package crackingthecodinginterview.chapter2.data;

public class Util {
    public static Node loadData(int k) {
        Node head = new Node((int) (Math.random() * 10));
        Node current = head;

        for (int i = 0; i < k-1; i++) {
            current.next = new Node((int) (Math.random() * 10));
            current.next.previous = current;
            current = current.next;
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
