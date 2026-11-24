class Solution 
{

    public int gcd(int a, int b) 
    {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int lcm(int a, int b) 
    {
        return (a / gcd(a, b)) * b;
    }

    public int maxLength(int[] nums) 
    {
        int n = nums.length;
        int maxLength = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            int prod = nums[i];
            int gcd1 = nums[i];
            int lcm1 = nums[i];
            for(int j = i + 1; j < n; j++)
            {
                
    
                prod = prod * nums[j];
                

                gcd1 = gcd(gcd1, nums[j]);
                lcm1 = lcm(lcm1, nums[j]);

                if(prod == (gcd1 * lcm1))
                {
                    maxLength = Math.max(maxLength, j - i + 1);


                }

            }

        }

        return maxLength;

        
    }
}