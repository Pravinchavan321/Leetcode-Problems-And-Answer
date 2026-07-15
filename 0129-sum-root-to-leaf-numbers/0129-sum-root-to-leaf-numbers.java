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

//     public int sumNumbersAll(TreeNode root, int total, int num) {
//         if (root == null) {
//             return 0;
//         }

//         if (root.left == null && root.right == null) {
//             num = num * 10 + root.val;
//             total = total + num;
//             return total;
//         }

//         num = num * 10 + root.val;
//         if (root.left != null) {

//             total = sumNumbersAll(root.left, total, num);
//         }

//         if (root.right != null) {
//             total = sumNumbersAll(root.right, total, num);
//         }

//         return total;

//     }

//     public int sumNumbers(TreeNode root) {
//         int num = 0;
//         int total = 0;

//         return sumNumbersAll(root, total, num);

//     }

// }

//(2)

class Solution {

    public int sumNumbersAll(TreeNode root, int num) {
        if (root == null) {
            return 0;
        }

        num = num * 10 + root.val;

        if (root.left == null && root.right == null) {
            return num;
        }

        return sumNumbersAll(root.left, num)
                + sumNumbersAll(root.right, num);
    }

    public int sumNumbers(TreeNode root) {
        return sumNumbersAll(root, 0);
    }
}