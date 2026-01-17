import java.util.Scanner;

class singlyLinkedListNode {
    int data;
    singlyLinkedListNode next;

    singlyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class cycledetection {

    // Function to detect cycle
    static boolean hasCycle(singlyLinkedListNode head) {
        singlyLinkedListNode slow = head;
        singlyLinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("false");
            return;
        }

        // Input node values
        System.out.println("Enter node values:");
        singlyLinkedListNode head = new singlyLinkedListNode(sc.nextInt());
        singlyLinkedListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new singlyLinkedListNode(sc.nextInt());
            temp = temp.next;
        }

        // Ask if cycle should be created
        System.out.print("Enter position to create cycle (-1 for no cycle): ");
        int pos = sc.nextInt();

        if (pos != -1) {
            singlyLinkedListNode cycleNode = head;
            for (int i = 0; i < pos; i++) {
                cycleNode = cycleNode.next;
            }
            temp.next = cycleNode; // create cycle
        }

        // Check for cycle
        System.out.println(hasCycle(head));

        sc.close();
    }
}

