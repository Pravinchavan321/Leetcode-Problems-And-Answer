class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        // Queue stores {node, index} pairs
        Queue<long[]> q = new LinkedList<>();
        // Can't store object in long[], so use two parallel structures
        
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Long> indices = new LinkedList<>();

        nodes.offer(root);
        indices.offer(1L);
        int maxWidth = 0;

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            long first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                long idx = indices.poll();

                if (i == 0) first = idx;
                if (i == size - 1) last = idx;

                // Normalize index to prevent overflow
                long pos = idx - first;

                if (node.left != null) {
                    nodes.offer(node.left);
                    indices.offer(2 * pos);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                    indices.offer(2 * pos + 1);
                }
            }

            maxWidth = Math.max(maxWidth, (int)(last - first + 1));
        }

        return maxWidth;
    }
}