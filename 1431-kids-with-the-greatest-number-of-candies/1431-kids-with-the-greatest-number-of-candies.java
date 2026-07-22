
//(1)

// class Solution {
//     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

//         int n = candies.length;
//         List<Boolean> resList = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             int max = Integer.MIN_VALUE;
//             for (int j = 0; j < n; j++) {
//                 if (i != j) {
//                     if (candies[j] > max) {
//                         max = candies[j];
//                     }

//                 }

//             }

//             if (candies[i] + extraCandies >= max) {
//                 resList.add(true);
//             } else {
//                 resList.add(false);
//             }
//         }

//         return resList;

//     }
// }

//(2)

// class Solution {
//     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

//         int n = candies.length;
//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//         List<Boolean> resList = new ArrayList<>();
//         for (int i = 0; i < n; i++) {

//             maxHeap.offer(candies[i]);

//         }

//         for (int i = 0; i < n; i++) {
//             if (maxHeap.peek() == candies[i]) {
//                 int elem = maxHeap.poll();
//                 if (maxHeap.peek() <= candies[i] + extraCandies) {
//                     resList.add(true);
//                 } else {
//                     resList.add(false);
//                 }
//                 maxHeap.offer(elem);

//             } else {
//                 if (maxHeap.peek() <= candies[i] + extraCandies) {
//                     resList.add(true);
//                 } else {
//                     resList.add(false);
//                 }

//             }
//         }

//         return resList;

//     }
// }

//(3)

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (i == 0) {
                max = candies[i];
            } else if (max < candies[i])
                max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}