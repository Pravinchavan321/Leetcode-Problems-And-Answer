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
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if (head.next == null) {
            return head;
        }

        ListNode left = head;
        ListNode right = head.next;

        while (right != null) {
            int gcdOfTwo = gcd(left.val, right.val);
            ListNode gcdNode = new ListNode(gcdOfTwo);
            left.next = gcdNode;
            gcdNode.next = right;
            left = right;
            right = right.next;

        }

        return head;

    }
}