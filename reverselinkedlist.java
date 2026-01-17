import java.util.Scanner;
class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class reverselinkedlist {
    // Reverse function
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = head;
        while (curr != null) {
            SinglyLinkedListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Enter node values:");
        SinglyLinkedListNode head = new SinglyLinkedListNode(sc.nextInt());
        SinglyLinkedListNode temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new SinglyLinkedListNode(sc.nextInt());
            temp = temp.next;
        }
        head = reverse(head);
        // Print reversed list
        System.out.println("Reversed Linked List:");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        sc.close();
    }
}
