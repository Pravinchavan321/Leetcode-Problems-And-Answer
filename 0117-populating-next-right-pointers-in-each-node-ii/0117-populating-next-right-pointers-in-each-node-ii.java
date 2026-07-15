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




                        //(1)


// class Solution {
//     public Node connect(Node root) {
//         if (root == null) {
//             return root;
//         }

//         Queue<Node> q = new ArrayDeque<>();
//         q.offer(root);

//         while (!q.isEmpty()) {
//             int size = q.size();

//             while (size > 0) {
//                 Node lastElem = q.poll();
//                 if (size > 1) {
//                     lastElem.next = q.peek();

//                 }

//                 if (lastElem.left != null) {

//                     q.offer(lastElem.left);
//                 }
//                 if (lastElem.right != null) {
//                     q.offer(lastElem.right);

//                 }

//                 size--;

//             }

//         }

//         return root;

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