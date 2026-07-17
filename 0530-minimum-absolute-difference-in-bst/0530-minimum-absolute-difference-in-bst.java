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

//  (((This is to find minDiff between the in tree between root & left and root & right)))
// class Solution {

//     public int getMinimumDifference(TreeNode root) {

//         int minDiff = Integer.MAX_VALUE;

//         if (root.left != null) {

//             minDiff = Math.min(Math.abs(root.val - root.left.val), getMinimumDifference(root.left));
//         }
//         if (root.right != null) {
//             minDiff = Math.min(minDiff,
//                     Math.min(Math.abs(root.val - root.right.val), getMinimumDifference(root.right)));

//         }

//         return minDiff;

//     }
// }

//(1)

// class Solution {

//     public List<Integer> list = new ArrayList<>();

//     public void inorderBst(TreeNode root) {

//         if (root == null) {
//             return;
//         }
//         inorderBst(root.left);
//         list.add(root.val);
//         inorderBst(root.right);

//         return;

//     }

//     public int getMinimumDifference(TreeNode root) {
//         inorderBst(root);

//         int n = list.size();
//         int minDiff = Integer.MAX_VALUE;
//         for (int i = 0; i < n - 1; i++) {
//             int diff = Math.abs(list.get(i) - list.get(i + 1));
//             if (diff < minDiff) {
//                 minDiff = diff;
//             }

//         }

//         return minDiff;

//     }
// }

//(2)

class Solution {

    public int previous = -1;
    public int minDiff = Integer.MAX_VALUE;

    public void inorderBst(TreeNode root) {

        if (root == null) {
            return;
        }
        inorderBst(root.left);
        if (previous != -1 && minDiff > Math.abs(root.val - previous)) {

            minDiff = Math.abs(root.val - previous);
        }
        previous = root.val;
        inorderBst(root.right);

        return;

    }

    public int getMinimumDifference(TreeNode root) {
        inorderBst(root);

        return minDiff;

    }
}