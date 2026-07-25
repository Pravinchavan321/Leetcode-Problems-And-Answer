/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//(1)

// class Solution {
//     public int findSecondMinimumValue(TreeNode root) {
//         if (root.left == null) return -1;

//         Queue<TreeNode> nodesQueue = new LinkedList<>();
//         nodesQueue.add(root);
//         int secondMin = Integer.MAX_VALUE;
//         int minVal = root.val;
//         boolean found = false;

//         while (!nodesQueue.isEmpty()) {
//             TreeNode currentNode = nodesQueue.poll();

//             if (currentNode.left != null) {
//                 nodesQueue.add(currentNode.left);
//                 nodesQueue.add(currentNode.right);

//                 if (currentNode.left.val > minVal) {
//                     secondMin = Math.min(secondMin, currentNode.left.val);
//                     found = true;
//                 }

//                 if (currentNode.right.val > minVal) {
//                     secondMin = Math.min(secondMin, currentNode.right.val);
//                     found = true;
//                 }
//             }
//         }

//         return found ? secondMin : -1;
//     }
// }

//(2)
class Solution {
    public int findSecondMinimumValue(TreeNode root) {

        if (root == null || root.left == null)
            return -1;

        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.offer(root);

        int firstMin = root.val;
        long secondMin = Long.MAX_VALUE;

        while (!nodesQueue.isEmpty()) {
            TreeNode currentNode = nodesQueue.poll();

            if (currentNode.left != null) {
                nodesQueue.offer(currentNode.left);

                if (currentNode.left.val != firstMin &&
                        currentNode.left.val < secondMin) {
                    secondMin = currentNode.left.val;
                }
            }

            if (currentNode.right != null) {
                nodesQueue.offer(currentNode.right);

                if (currentNode.right.val != firstMin &&
                        currentNode.right.val < secondMin) {
                    secondMin = currentNode.right.val;
                }
            }
        }

        return secondMin == Long.MAX_VALUE ? -1 : (int) secondMin;
    }
}