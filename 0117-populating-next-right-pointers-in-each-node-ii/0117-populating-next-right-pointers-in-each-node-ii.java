/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();

            while (size > 0) {
                Node lastElem = q.poll();
                if (size > 1) {
                    lastElem.next = q.peek();

                }

                if (lastElem.left != null) {

                    q.offer(lastElem.left);
                }
                if (lastElem.right != null) {
                    q.offer(lastElem.right);

                }

                size--;

            }

        }

        return root;

    }
}