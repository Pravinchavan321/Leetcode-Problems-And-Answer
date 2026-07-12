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
    public ListNode mergeNodes(ListNode head) {
        ListNode newList = new ListNode(0);
        ListNode newListHead = newList;
        ListNode newListHead1 = newList;
        ListNode left = head;
        ListNode right = head.next;
        int sum = 0;
        while (right != null) {
            if (right.val == 0) {
                newListHead1.next = new ListNode(sum);
                newListHead1 = newListHead1.next;
                sum = 0;
                left = right;
                right = right.next;

            } else {
                sum = sum + right.val;
                right = right.next;
            }

        }

        return newListHead.next;

    }
}