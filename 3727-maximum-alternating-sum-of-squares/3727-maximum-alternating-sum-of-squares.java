class Solution {
    public long maxAlternatingSum(int[] nums) {

        int n = nums.length;
        for(int i = 0; i < n; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        long posSignSum = 0; 
        long negSignSum = 0; 

        for(int i = 0; i < n; i++){
            if(i < (n / 2)){
                negSignSum += nums[i];

            }else{
                posSignSum += nums[i];

            }

        }

        return posSignSum - negSignSum;
        
    }
}