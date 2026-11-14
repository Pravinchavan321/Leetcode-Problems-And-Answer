

                //(1)
class Solution 
{
    public int minimumSumSubarray(List<Integer> nums, int l, int r) 
    {
        int n = nums.size();

        if(n < l)
        {
            return -1;
        }

        int[] prefix = new int[n + 1];

        for(int i = 0; i < n; i++)
        {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                int len = j - i + 1;

                if(len >= l && len <= r)
                {
                    int sum = prefix[j + 1] - prefix[i];

                    if(sum > 0)
                    {
                        minSum = Math.min(minSum, sum);
                    }
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}



            //(2)
// class Solution 
// {
//     public int minimumSumSubarray(List<Integer> nums, int l, int r) 
//     {
//         int n = nums.size();

//         if(n < l)
//         {
//             return -1;
//         }

//         int[] prefix = new int[n + 1];

//         for(int i = 0; i < n; i++)
//         {
//             prefix[i + 1] = prefix[i] + nums.get(i);
//         }

//         int minSum = Integer.MAX_VALUE;

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i; j < n; j++)
//             {
//                 int len = j - i + 1;

//                 if(len >= l && len <= r)
//                 {
//                     int sum = prefix[j + 1] - prefix[i];

//                     if(sum > 0)
//                     {
//                         minSum = Math.min(minSum, sum);
//                     }
//                 }
//             }
//         }

//         return minSum == Integer.MAX_VALUE ? -1 : minSum;
//     }
// }