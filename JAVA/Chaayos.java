public class Chaayos {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node segregate(Node head) {
        // Dummy heads help us build three separate lists: 0s, 1s, and 2s.
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        // These pointers always point to the last node of each separate list.
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        // curr starts from the first node and moves one step in every iteration.
        Node curr = head;

        while (curr != null) {
            // Each iteration works on one node:
            // 1. Save the next node before breaking the current link.
            Node next = curr.next;

            // 2. Detach curr so it can be safely added to the correct list.
            curr.next = null;

            // switch (curr.data) {
            //     case 0:
            //         zero.next = curr;
            //         zero = curr;
            //         break;
            //     case 1:
            //         one.next = curr;
            //         one = curr;
            //         break;
            //     case 2:
            //         two.next = curr;
            //         two = curr;
            //         break;
            //     default:
            //         break;
            // }
            if (curr.data == 0) {
                // If curr is 0, attach it after the last 0 node.
                zero.next = curr;
                // Move zero forward, because curr is now the last 0 node.
                zero = curr;
            } else if (curr.data == 1) {
                // If curr is 1, attach it after the last 1 node.
                one.next = curr;
                // Move one forward, because curr is now the last 1 node.
                one = curr;
            } else {
                // If curr is 2, attach it after the last 2 node.
                two.next = curr;
                // Move two forward, because curr is now the last 2 node.
                two = curr;
            }

            // 3. Go to the next original node for the next iteration.
            curr = next;
        }

        // After all iterations:
        // Connect 0-list -> 1-list if it exists, otherwise directly to 2-list.
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;

        // Connect 1-list -> 2-list.
        one.next = twoHead.next;

        // Return the first real node from the first non-empty list.
        if (zeroHead.next != null) return zeroHead.next;
        if (oneHead.next != null) return oneHead.next;
        return twoHead.next;
    }
}