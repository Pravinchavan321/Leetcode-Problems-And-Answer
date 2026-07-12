
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
class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;
        int[] arrCopy = new int[n];
        for (int i = 0; i < n; i++) {
            arrCopy[i] = arr[i];

        }
        Arrays.sort(arr);

        Map<Integer, Integer> hashMap = new HashMap<>();
        int rank = 1;
        for (int no : arr) {
            if (!hashMap.containsKey(no)) {
                hashMap.put(no, rank++);

            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = hashMap.get(arrCopy[i]);
        }

        return arr;

    }
}

//(3)
// class Solution {
//     public int[] arrayRankTransform(int[] arr) {

//         int n = arr.length;

//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         for (int num : arr) {
//             pq.offer(num);
//         }

//         HashMap<Integer, Integer> hashMap = new HashMap<>();

//         int rank = 1;

//         while (!pq.isEmpty()) {
//             int num = pq.poll();

//             if (!hashMap.containsKey(num)) {
//                 hashMap.put(num, rank++);
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             arr[i] = hashMap.get(arr[i]);
//         }

//         return arr;
//     }
// }