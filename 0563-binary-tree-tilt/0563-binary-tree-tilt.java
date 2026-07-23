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
class Solution {

    public int totalSumNew = 0;

    public int findTilt1(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sumLeft = findTilt1(root.left);
        int sumRight = findTilt1(root.right);
        int rootVal = root.val;

        root.val = Math.abs(sumLeft - sumRight);
        totalSumNew += root.val;

        return sumLeft + sumRight + rootVal;

    }

    public int findTilt(TreeNode root) {
        findTilt1(root);

        return totalSumNew;
    }
}