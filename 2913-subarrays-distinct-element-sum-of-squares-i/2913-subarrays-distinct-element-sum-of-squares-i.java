class Solution {
    public int sumCounts(List<Integer> nums) {

        int[] arr = new int[101];
        int n = nums.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                arr[nums.get(j)]++;
                int count = 0;
                for (int index = 0; index < arr.length; index++) {
                    if (arr[index] > 0) {

                        count++;
                    }
                }
                sum += count * count;
            }
            Arrays.fill(arr, 0);

        }

        return sum;

    }
}