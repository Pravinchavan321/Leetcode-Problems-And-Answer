
//(1)

// class Solution {
//     public int maxProduct(int[] nums) {

//         int n = nums.length;
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

//         for(int i = 0; i < 2; i++)
//         {
//             minHeap.offer(nums[i]);
//         }

//         for(int i = 2; i < n; i++)
//         {
//             if(minHeap.peek() < nums[i])
//             {
//                 minHeap.poll();
//                 minHeap.offer(nums[i]);
//             }
//         }

//         return (minHeap.poll() - 1) * (minHeap.poll() - 1);

//     }
// }

//(2)

class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        return (max1 - 1) * (max2 - 1);

    }
}