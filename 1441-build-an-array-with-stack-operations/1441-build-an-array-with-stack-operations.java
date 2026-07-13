class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        
        Stack<Integer> st = new Stack<>();
        List<String> list = new ArrayList<>();
        int tL = target.length;
        int i = 0;
        int no = 1;

        if(target[tL - 1] > n)
        {
            return list;
        }
        if(target[tL- 1] == no)
        {
            list.add("Push");
            return list;
        }

        while(target[tL- 1] != no)
        {

            if(st.isEmpty())
            {
                st.push(no);
                list.add("Push");
            }
            else if(!st.isEmpty() && target[i] == st.peek())
            {
                i++;
                st.push(++no);
                list.add("Push");
            }
            else if(!st.isEmpty() && target[i] != st.peek())
            {
                st.pop();
                list.add("Pop");
                list.add("Push");
                st.push(++no);

            }

        }


        return list;
        
    }
}