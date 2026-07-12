
//(1)
// class Solution {
//     public int[] arrayRankTransform(int[] arr) {

//         int n = arr.length;
//         TreeMap<Integer, Integer> treeMap = new TreeMap<>();
//         for (int i = 0; i < n; i++) {
//             treeMap.put(arr[i], 0);
//         }

//         int rank = 1;
//         for (int num : treeMap.keySet()) {
//             treeMap.put(num, rank++);

//         }

//         for (int i = 0; i < n; i++) {
//             arr[i] = treeMap.get(arr[i]);
//         }

//         return arr;

//     }
// }

//(2)
// class Solution {
//     public int[] arrayRankTransform(int[] arr) {

//         int n = arr.length;

//         return arr;

//     }
// }

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int rank = 1;

        while (!pq.isEmpty()) {
            int num = pq.poll();

            if (!hashMap.containsKey(num)) {
                hashMap.put(num, rank++);
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = hashMap.get(arr[i]);
        }

        return arr;
    }
}