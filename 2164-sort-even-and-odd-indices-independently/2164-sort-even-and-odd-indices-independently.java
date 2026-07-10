
//(1)

// class Solution {
//     public int[] sortEvenOdd(int[] nums) {

//         int n = nums.length;

//         int[] even;
//         if (n % 2 == 0) {

//             even = new int[n / 2];
//         } else {

//             even = new int[n / 2 + 1];
//         }

//         int[] odd = new int[n / 2];

//         int e = 0, o = 0;

//         for (int i = 0; i < n; i++) {
//             if (i % 2 == 0)
//                 even[e++] = nums[i];
//             else
//                 odd[o++] = nums[i];
//         }

//         Arrays.sort(even);
//         Arrays.sort(odd);

//         e = 0;
//         o = odd.length - 1;

//         for (int i = 0; i < n; i++) {
//             if (i % 2 == 0)
//                 nums[i] = even[e++];
//             else
//                 nums[i] = odd[o--];
//         }

//         return nums;
//     }
// }

//(2)

class Solution {
    public int[] sortEvenOdd(int[] nums) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // Separate even and odd indexed elements
        for (int i = 0; i < nums.length; i++) {
            if ((i & 1) == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }

        Collections.sort(even);

        odd.sort(Collections.reverseOrder());

        int e = 0, o = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((i & 1) == 0)
                nums[i] = even.get(e++);
            else
                nums[i] = odd.get(o++);
        }

        return nums;
    }
}