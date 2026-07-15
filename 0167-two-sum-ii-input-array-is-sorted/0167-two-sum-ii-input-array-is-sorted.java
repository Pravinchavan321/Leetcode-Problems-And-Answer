class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;
        int i = 0;
        int j = n - 1;
        int[] resArr = new int[2];
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                resArr[0] = i + 1;
                resArr[1] = j + 1;
                break;

            } else if (numbers[i] + numbers[j] > target) {
                j--;

            } else {
                i++;
            }
        }

        return resArr;

    }
}