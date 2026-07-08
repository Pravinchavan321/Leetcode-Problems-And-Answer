class Solution {
    public int[] shortestToChar(String s, char c) {

        List<Integer> list = new ArrayList<>();
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == c)
            {
                list.add(i);
            }
        }

        int[] arr = new int[n];
        if(list.size() == 1)
        {
            int index = list.get(0);
            for(int i = 0; i < n; i++)
            {

                arr[i] = Math.abs(i - index);




            }
            return arr;
            

        }
        int lF = 0;
        int lS = 1;
        int lFV = list.get(lF);
        int lSV = list.get(lS);
        for(int i = 0; i < n; i++)
        {
            if(i == lFV || i == lSV)
            {
                arr[i] = 0;
            }
            
            else if(i > lSV && lS < list.size() - 1)
            {
                lFV = list.get(++lF);
                lSV = list.get(++lS);
                arr[i] = Math.min(Math.abs(i - lFV), Math.abs(i - lSV));
            }
            else if(i > lFV && i < lSV)
            {
                arr[i] = Math.min(Math.abs(i - lFV), Math.abs(i - lSV));
            }
            else if(i <= lFV && lF == 0)
            {
                arr[i] = Math.abs(i - lFV);
            }
            else if(i >= lSV && lS == list.size() - 1)
            {
                arr[i] = Math.abs(i - lSV);
            }


        }

        return arr;
        
    }
}