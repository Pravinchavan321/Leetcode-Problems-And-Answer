//(1)
class Solution {
    public int[] replaceElements(int[] arr) {

        int n = arr.length;

        int prevElem = arr[n - 1];
        arr[n - 1] = -1;
        int max = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(prevElem, arr[i + 1]);
            prevElem = arr[i];
            arr[i] = max;

        }

        return arr;

    }
}

//(2)

// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n = arr.length;
//         int maxRight = -1;

//         for (int i = n - 1; i >= 0; i--) {
//             int current = arr[i];
//             arr[i] = maxRight;
//             if (current > maxRight) {
//                 maxRight = current;
//             }
//         }
//         return arr;
//     }
// }
