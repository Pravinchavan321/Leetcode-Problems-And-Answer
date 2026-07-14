/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode left = head;

        ListNode right = head.next;
        ListNode nextNode = right.next;

        while (left != null && left.next != null) {
            nextNode = right.next;
            left.next = nextNode;
            right.next = left;
            if (prev == null) {
                head = right;
                prev = left;

            } else {

                prev.next = right;
                prev = left;
            }

            left = nextNode;
            if (left != null) {

                right = nextNode.next;
            }

        }

        return head;

    }
}