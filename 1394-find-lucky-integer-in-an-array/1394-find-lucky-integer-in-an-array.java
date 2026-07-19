//(1)

// class Solution {
//     public int findLucky(int[] arr) {

//         int n = arr.length;
//         Arrays.sort(arr);
//         int luckyNo = -1;
//         int lastElem = arr[n - 1];
//         int count = 0;
//         for (int i = n - 1; i >= 0; i--) {
//             if (arr[i] == lastElem) {
//                 count++;

//             } else if (arr[i] != lastElem) {
//                 if (count == lastElem) {
//                     luckyNo = lastElem;
//                     break;
//                 } else {
//                     count = 1;
//                     lastElem = arr[i];

//                 }

//             }

//         }
//         if (count == lastElem) {
//             luckyNo = lastElem;
//         }

//         return luckyNo;
//     }
// }

//(2)

// class Solution {
//     public int findLucky(int[] arr) {

//         TreeMap<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             treeMap.put(arr[i], treeMap.getOrDefault(arr[i], 0) + 1);
//         }
//         int luckyNo = -1;
//         for (int num : treeMap.keySet()) {
//             if (num == treeMap.get(num)) {
//                 luckyNo = num;
//                 break;
//             }

//         }

//         return luckyNo;
//     }
// }

//(3)

class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = -1;
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}