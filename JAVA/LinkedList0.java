public class LinkedList0 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }

        return dummy.next;
    }

  // Reverse Linked List
  public static ListNode reverseList(ListNode head) {

    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {

        ListNode next = curr.next;

        curr.next = prev;

        prev = curr;
        curr = next;
    }

    return prev;
}

    static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        ListNode head = createLinkedList(values);

        System.out.print("Original list: ");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.print("Reversed list: ");
        printList(reversedHead);
    }
}