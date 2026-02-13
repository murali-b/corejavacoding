import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FMLWKS {
    public static <T> T findMiddle(Iterable<T> iterable) {
        Iterator<T> slow = iterable.iterator();
        Iterator<T> fast = iterable.iterator();

        while (fast.hasNext()) {
            fast.next(); // Move fast once
            if (fast.hasNext()) {
                fast.next(); // Move fast twice
                slow.next(); // Move slow once
            }
        }
        return slow.hasNext() ? slow.next() : null;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Sigma");
        System.out.println("Middle: " + findMiddle(names)); // Output: Gamma

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        MiddleOfList.findMiddle(head);
    }

}
class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

 class MiddleOfList {
    public static void findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        // Move fast by 2 and slow by 1
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (slow != null) {
            System.out.println("The middle element is: " + slow.data);
        }
    }

    /*public static void main(String[] args) {
        // Creating a list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        findMiddle(head);
    }*/
}
