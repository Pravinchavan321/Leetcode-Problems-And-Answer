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

//(1)

// class Solution {
//     public ListNode reverseLinkedList(ListNode l1) {
//         ListNode prev = null;
//         ListNode curr = l1;
//         ListNode nextN = curr.next;

//         while (curr != null) {
//             curr.next = prev;
//             prev = curr;
//             curr = nextN;
//             if (nextN != null) {

//                 nextN = nextN.next;
//             }

//         }

//         return prev;

//     }

//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         l1 = reverseLinkedList(l1);
//         l2 = reverseLinkedList(l2);
//         ListNode head = new ListNode();
//         ListNode newLL = head;
//         ListNode newLLPrev = null;
//         int carry = 0;

//         while (l1 != null || l2 != null) {
//             int sum = 0;
//             if (l1 == null) {
//                 sum = l2.val + carry;
//                 l2 = l2.next;

//             } else if (l2 == null) {
//                 sum = l1.val + carry;
//                 l1 = l1.next;

//             } else {
//                 sum = l1.val + l2.val + carry;
//                 l1 = l1.next;
//                 l2 = l2.next;

//             }
//             newLL.val = sum % 10;
//             newLL.next = new ListNode();
//             newLLPrev = newLL;
//             newLL = newLL.next;

//             carry = sum / 10;

//         }
//         if (carry > 0) {
//             newLL.val = carry;

//         } else {

//             newLLPrev.next = null;
//         }

//         return reverseLinkedList(head);

//     }
// }

//(2)

class Solution {
    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextN = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextN;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseLinkedList(l1);
        l2 = reverseLinkedList(l2);

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
        }

        return reverseLinkedList(dummy.next);
    }
}