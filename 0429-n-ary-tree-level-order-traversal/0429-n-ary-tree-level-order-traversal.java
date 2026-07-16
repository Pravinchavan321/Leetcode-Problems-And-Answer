/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


//(1)


class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> nArrList = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        nArrList.add(Arrays.asList(root.val));

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            while (size > 0) {
                Node elem = q.poll();
                int idx = 0;
                while (idx < elem.children.size()) {
                    Node child = elem.children.get(idx++);
                    q.offer(child);
                    list.add(child.val);

                }
                size--;
            }

            nArrList.add(list);
        }
        nArrList.remove(nArrList.size() - 1);

        return nArrList;

    }
}


//(2)


// class Solution {
//     public List<List<Integer>> levelOrder(Node root) {
//         if (root == null) {
//             return new ArrayList<>();
//         }

//         List<List<Integer>> nArrList = new ArrayList<>();
//         Queue<Node> q = new ArrayDeque<>();
//         q.offer(root);
//         nArrList.add(Arrays.asList(root.val));

//         while (!q.isEmpty()) {
//             int size = q.size();
//             List<Integer> list = new ArrayList<>();

//             while (size-- > 0) {
//                 Node elem = q.poll();

//                 if (elem.children != null) {
//                     for (Node child : elem.children) {
//                         q.offer(child);
//                         list.add(child.val);
//                     }
//                 }
//             }

//             if (!list.isEmpty()) {      // instead of removing later
//                 nArrList.add(list);
//             }
//         }

//         return nArrList;
//     }
// }