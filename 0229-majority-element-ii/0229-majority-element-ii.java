class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        for (int num : hashMap.keySet()) {
            if (hashMap.getOrDefault(num, 0) > (n / 3)) {
                list.add(num);
            }
        }

        return list;

    }
}