class Solution {
    public int findSpecialInteger(int[] arr) {

        int n = arr.length;
        int moreThan25 = n / 4;
        int i = 0;
        int j = 0;
        int ans = arr[i];
        while(j < n)
        {
            if(arr[i] == arr[j])
            {
                if((j - i) > moreThan25)
                {
                    ans = arr[i];
                    return ans;
                }
            
                j++;
            }
            else
            {
                i = j;
                

            }


        }

        return ans;

        
    }
}