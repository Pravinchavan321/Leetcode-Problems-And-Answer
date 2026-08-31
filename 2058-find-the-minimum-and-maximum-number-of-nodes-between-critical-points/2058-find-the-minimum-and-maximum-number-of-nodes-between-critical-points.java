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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if (head.next.next == null || head.next.next.next == null) {
            return new int[] { -1, -1 };
        }

        ListNode prevNode = head;
        ListNode currNode = head.next;
        ListNode nextNode = currNode.next;
        int firstCriticalPointIndex = -1;
        int previousCriticalPointIndex = -1;
        int currCriticalPointIndex = -1;
        int criticalPoints = 0;
        int minDistance = Integer.MAX_VALUE;

        int index = 2;
        while (nextNode != null) {
            if ((currNode.val > nextNode.val && currNode.val > prevNode.val)
                    || (currNode.val < nextNode.val && currNode.val < prevNode.val)) {
                if (firstCriticalPointIndex == -1) {
                    firstCriticalPointIndex = index;

                }
                previousCriticalPointIndex = currCriticalPointIndex;

                currCriticalPointIndex = index;

                if (previousCriticalPointIndex != -1) {
                    int currDistance = currCriticalPointIndex - previousCriticalPointIndex;
                    if (minDistance > currDistance) {
                        minDistance = currDistance;

                    }
                }

                criticalPoints++;
            }

            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
            index++;

        }
        if (criticalPoints < 2) {
            return new int[] { -1, -1 };

        }
        int maxDistance = currCriticalPointIndex - firstCriticalPointIndex;

        return new int[] { minDistance, maxDistance };

    }
}