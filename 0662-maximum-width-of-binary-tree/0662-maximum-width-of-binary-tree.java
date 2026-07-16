class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();  // Fix 1: LinkedList instead of ArrayDeque

        q.offer(root);
        int max = 1;

        while (!q.isEmpty()) {
            int index1 = -1;
            int index2 = -1;
            int count = 0;

            for (TreeNode node : q) {
                if (index1 == -1 && node != null) {
                    index1 = count;
                } else if (node != null) {
                    index2 = count;
                }
                count++;
            }
            if (index1 == -1) {
                break;
            }

            max = Math.max(max, index2 - index1 + 1);

            int size = q.size();

            while (size > 0) {
                TreeNode elem = q.poll();
                if (elem == null) {
                    q.offer(null);
                    q.offer(null);
                } else {                    // Fix 2 & 3: simplified block, always push both children
                    q.offer(elem.left);
                    q.offer(elem.right);
                }
                size--;                    // Fix 4: decrement size
            }
        }

        return max;
    }
}