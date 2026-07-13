//(1)

// class Solution {
//     public List<String> buildArray(int[] target, int n) {

//         Stack<Integer> st = new Stack<>();
//         List<String> list = new ArrayList<>();
//         int tL = target.length;
//         int i = 0;
//         int no = 1;

//         if (target[tL - 1] > n) {
//             return list;
//         }
//         if (target[tL - 1] == no) {
//             list.add("Push");
//             return list;
//         }

//         while (target[tL - 1] != no) {

//             if (st.isEmpty()) {
//                 st.push(no);
//                 list.add("Push");
//             } else if (!st.isEmpty() && target[i] == st.peek()) {
//                 i++;
//                 st.push(++no);
//                 list.add("Push");
//             } else if (!st.isEmpty() && target[i] != st.peek()) {
//                 st.pop();
//                 list.add("Pop");
//                 list.add("Push");
//                 st.push(++no);

//             }

//         }

//         return list;

//     }
// }

//(2)
class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> list = new ArrayList<>();
        int tL = target.length;
        int i = 0;
        int no = 1;
        int prev = 1;;
        if (target[tL - 1] > n) {
            return list;
        }
        if (target[tL - 1] == no) {
            list.add("Push");
            return list;
        }

        while (target[tL - 1] != no) {

            if (list.size() == 0) {
                prev = no;
                list.add("Push");

            } else if (list.size() != 0 && target[i] == prev) {
                i++;
                no++;
                prev = no;
                list.add("Push");
            } else if (list.size() != 0 && target[i] != prev) {
                no++;
                prev = no;
                list.add("Pop");
                list.add("Push");

            }

        }

        return list;

    }
}