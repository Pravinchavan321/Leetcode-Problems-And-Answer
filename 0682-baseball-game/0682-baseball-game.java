//(1)

// class Solution {
//     public int calPoints(String[] operations) {

//         Stack<Integer> st = new Stack<>();

//         int n = operations.length;
//         int sum = 0;

//         for (int i = 0; i < n; i++) {
//             String ops = operations[i];
//             if (Character.isDigit(ops.charAt(ops.length() - 1))) {
//                 int value = Integer.parseInt(ops);
//                 sum += value;
//                 st.push(value);

//             } else if (ops.equals("C") && st.size() >= 1) {
//                 sum -= st.pop();

//             } else if (ops.equals("D") && st.size() >= 1) {
//                 sum += (2 * st.peek());
//                 st.push(2 * st.peek());

//             } else if (ops.equals("+") && st.size() >= 2) {
//                 int lastVal = st.pop();
//                 int secondLastVal = st.pop();
//                 int lastTwoSum = lastVal + secondLastVal;
//                 st.push(secondLastVal);
//                 st.push(lastVal);
//                 st.push(lastTwoSum);
//                 sum += lastTwoSum;

//             }
//         }

//         return sum;

//     }
// }

//(2)

class Solution {
    public int calPoints(String[] operations) {

        int[] score = new int[operations.length];
        int top = -1;
        int sum = 0;

        for (String op : operations) {

            if (op.equals("+")) {
                int val = score[top] + score[top - 1];
                score[++top] = val;
                sum += val;

            } else if (op.equals("D")) {
                int val = 2 * score[top];
                score[++top] = val;
                sum += val;

            } else if (op.equals("C")) {
                sum -= score[top--];

            } else {
                int val = Integer.parseInt(op);
                score[++top] = val;
                sum += val;
            }
        }

        return sum;
    }
}