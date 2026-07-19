class Solution {
    public int findLucky(int[] arr) {

        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            treeMap.put(arr[i], treeMap.getOrDefault(arr[i], 0) + 1);
        }
        int luckyNo = -1;
        for (int num : treeMap.keySet()) {
            if (num == treeMap.get(num)) {
                luckyNo = num;
                break;
            }

        }

        return luckyNo;
    }
}