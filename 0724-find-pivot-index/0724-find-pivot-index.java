class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int j = 0;
        int index = -1;

        while(j < nums.length)
        {
            if((j == 0) || (j == nums.length - 1))
            {
                if((j == 0) && (prefixSum[prefixSum.length - 1] - nums[j] == 0))
                {
                    return j;
                }
                else if((j == nums.length - 1) && (prefixSum[j - 1] == 0))
                {
                    return j;
                }
            }
            else if(prefixSum[j - 1] == prefixSum[prefixSum.length - 1] - prefixSum[j])
            {
                return j;
            }

            j++;
        }

        return index;
    }
}