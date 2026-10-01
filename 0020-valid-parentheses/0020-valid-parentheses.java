
                        //(1)

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

                            //(2)

// class Solution {
//     public boolean isValid(String s) {

//         if (s.length() == 1) {
//             return false;
//         }

//         Stack<Character> st = new Stack<>();
//         Map<Character, Character> hashMap = new HashMap<>();
//         hashMap.put('(', ')');
//         hashMap.put('{', '}');
//         hashMap.put('[', ']');

//         for (char c : s.toCharArray()) {

//             if (hashMap.containsKey(c)) { // Opening bracket
//                 st.push(c);

//             } else { // Closing bracket

//                 if (st.isEmpty()) {
//                     return false;
//                 }

//                 if (hashMap.get(st.peek()) == c) {
//                     st.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         return st.isEmpty();
//     }
// }