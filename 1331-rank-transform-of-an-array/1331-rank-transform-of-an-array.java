class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            treeMap.put(arr[i], 0);
        }

        int rank = 1;
        for (int num : treeMap.keySet()) {
            treeMap.put(num, rank++);

        }

        for (int i = 0; i < n; i++) {
            arr[i] = treeMap.get(arr[i]);
        }

        return arr;

    }
}