                            //(1)

// class Solution {
//     public int findSpecialInteger(int[] arr) {

//         int n = arr.length;
//         int moreThan25 = n / 4;
//         int i = 0;
//         int j = 0;
//         int ans = arr[i];
//         while(j < n)
//         {
//             if(arr[i] == arr[j])
//             {
//                 if((j - i) + 1 > moreThan25)
//                 {
//                     ans = arr[i];
//                     return ans;
//                 }

//                 j++;
//             }
//             else
//             {
//                 i = j;

//             }

//         }

//         return ans;

//     }
// }

                                    //(2)

// class Solution {
//     public int findSpecialInteger(int[] arr) {

//         int n = arr.length;
//         int moreThan25 = n / 4;

//         HashMap<Integer, Integer> hashMap = new HashMap<>();

//         for (int num : arr) {
//             int freq = hashMap.getOrDefault(num, 0) + 1;

//             if (freq > moreThan25) {
//                 return num;
//             }

//             hashMap.put(num, freq);
//         }

//         return -1;
//     }
// }

                                //(3)


class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int k  = (n/4);
        if(n <= 1)
            return arr[0];

        for(int i = 0; i < n; i++){
            if(arr[i] == arr[i+k])
                return arr[i];
        }
        return -1;
        
    }
}