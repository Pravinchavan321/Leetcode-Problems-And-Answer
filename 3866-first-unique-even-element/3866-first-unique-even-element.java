class Solution {
    public int firstUniqueEven(int[] nums) {

        LinkedHashMap<Integer, Integer> lHM = new LinkedHashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                lHM.put(num, lHM.getOrDefault(num, 0) + 1);

            }
        }
        int ans = -1;
        for (int num : nums) {
            if (num % 2 == 0 && lHM.get(num) == 1) {
                ans = num;
                break;
            }
        }

        return ans;

    }
}