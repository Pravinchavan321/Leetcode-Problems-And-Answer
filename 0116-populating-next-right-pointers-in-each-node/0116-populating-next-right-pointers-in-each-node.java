class Solution {

    public Node helper(Node root, Node parent, boolean isLeft) {
        if (root == null)
            return null;

        if (parent == null) {
            root.next = null;
        } else if (isLeft) {
            root.next = parent.right;
        } else {
            root.next = (parent.next == null) ? null : parent.next.left;
        }

        helper(root.left, root, true);
        helper(root.right, root, false);

        return root;
    }

    public Node connect(Node root) {
        return helper(root, null, false);
    }
}