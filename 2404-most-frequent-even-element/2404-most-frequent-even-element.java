class Solution {
    public int mostFrequentEven(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> hashMap = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (b[1] == a[1]) {
                return a[0] - b[0];
            }

            return b[1] - a[1];
        });

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
            }
        }

        for (int num : hashMap.keySet()) {
            pq.offer(new int[] {num, hashMap.get(num) });
        }

        if(pq.isEmpty())
        {
            return -1;
        }

        return pq.poll()[0];

    }
}