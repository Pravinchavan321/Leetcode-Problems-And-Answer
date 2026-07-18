//(1)
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            }
            set.add(i);
        }

        return false;
    }
}

//(2)

// class Solution {
//     public boolean checkIfExist(int[] arr) {
//         Set<Integer> set = new HashSet<>();
//         int countZero = 0;
//         for (int i : arr) {

//             set.add(i);
//             if (i == 0 && countZero < 2) {
//                 countZero++;
//             }

//         }
//         for (int i : arr) {
//             if (i != 0) {
//                 if (set.contains(i * 2)) {
//                     return true;
//                 }
//             } else if (i == 0 && countZero > 1) {
//                 return true;
//             }

//         }

//         return false;
//     }
// }
