class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Set<Integer> hashSet = new HashSet<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr2) {
            hashSet.add(num);
        }
        for (int num : arr1) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            if (!hashSet.contains(num)) {
                hashSet.add(num);
                minHeap.offer(num);

            }

        }
        int idx = 0;
        for (int i = 0; i < arr2.length; i++) {
            int count = hashMap.get(arr2[i]);
            while (count > 0) {
                arr1[idx++] = arr2[i];
                count--;
            }
        }
        while (!minHeap.isEmpty()) {
            int num = minHeap.poll();
            int count = hashMap.get(num);
            while (count > 0) {
                arr1[idx++] = num;
                count--;
            }
        }

        return arr1;

    }
}