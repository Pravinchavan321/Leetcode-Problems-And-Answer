
                    //(1)

// class Solution {

//     public Node helper(Node root, Node parent, boolean isLeft) {
//         if (root == null)
//             return null;

//         if (parent == null) {
//             root.next = null;
//         } else if (isLeft) {
//             root.next = parent.right;
//         } else {
//             root.next = (parent.next == null) ? null : parent.next.left;
//         }

//         helper(root.left, root, true);
//         helper(root.right, root, false);

//         return root;
//     }

//     public Node connect(Node root) {
//         return helper(root, null, false);
//     }
// }



                //(2)


class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                if (i < size - 1) {
                    curr.next = q.peek();
                }

                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
        }

        return root;
    }
}