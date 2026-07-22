class Solution {
    public int countLargestGroup(int n) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;

            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);

        }

        int count = 0;

        for (int num : hashMap.keySet()) {
            max = Math.max(max, hashMap.getOrDefault(num, 0));

        }
        for (int num : hashMap.keySet()) {
            if (hashMap.getOrDefault(num, 0) == max) {
                count++;
            }

        }

        return count;

    }
}