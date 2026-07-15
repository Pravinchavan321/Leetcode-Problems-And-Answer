class Solution {
    public int evalRPN(String[] tokens) {

        int n = tokens.length;

        Stack<Integer> st = new Stack<>();

        int i = 0;

        while (i < n) {
            String token = tokens[i];
            if (token.equals("+")) {
                st.push(st.pop() + st.pop());

            } else if (token.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);

            } else if (token.equals("*")) {
                st.push(st.pop() * st.pop());

            } else if (token.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);

            } else {
                st.push(Integer.parseInt(token));
            }

            i++;

        }

        return st.peek();

    }
}