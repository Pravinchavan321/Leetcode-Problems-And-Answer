
//(1)

// class Solution {
//     public int[] relativeSortArray(int[] arr1, int[] arr2) {

//         Set<Integer> hashSet = new HashSet<>();
//         Map<Integer, Integer> hashMap = new HashMap<>();
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

//         for (int num : arr2) {
//             hashSet.add(num);
//         }
//         for (int num : arr1) {
//             hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
//             if (!hashSet.contains(num)) {
//                 hashSet.add(num);
//                 minHeap.offer(num);

//             }

//         }
//         int idx = 0;
//         for (int i = 0; i < arr2.length; i++) {
//             int count = hashMap.get(arr2[i]);
//             while (count > 0) {
//                 arr1[idx++] = arr2[i];
//                 count--;
//             }
//         }
//         while (!minHeap.isEmpty()) {
//             int num = minHeap.poll();
//             int count = hashMap.get(num);
//             while (count > 0) {
//                 arr1[idx++] = num;
//                 count--;
//             }
//         }

//         return arr1;

//     }
// }

//(2)

import java.util.TreeMap;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // TreeMap keeps the keys (numbers) automatically sorted!
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // 1. Count frequencies of all elements in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[arr1.length];
        int idx = 0;

        // 2. Place elements based on the order in arr2
        for (int num : arr2) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                while (count > 0) {
                    res[idx++] = num;
                    count--;
                }
                // Remove the element so we only have "leftovers" remaining
                map.remove(num);
            }
        }

        // 3. Place remaining elements. 
        // Because it's a TreeMap, map.keySet() is already in ascending order!
        for (int num : map.keySet()) {
            int count = map.get(num);
            while (count > 0) {
                res[idx++] = num;
                count--;
            }
        }

        return res;
    }
}