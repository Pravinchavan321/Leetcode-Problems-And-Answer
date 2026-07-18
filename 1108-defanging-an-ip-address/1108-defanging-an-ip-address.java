
//(1)
// class Solution {
//     public String defangIPaddr(String address) {

//         String[] arr = address.split("\\.");
//         int n = arr.length;
//         String[] res = new String[7];
//         int j = 0;
//         for (int i = 0; i < n; i++) {
//             if (i != n - 1) {
//                 res[j++] = arr[i];
//                 res[j++] = "[.]";

//             } else {
//                 res[j] = arr[i];

//             }

//         }

//         return String.join("", res);

//     }
// }

//(2)
class Solution {
    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();
        int n = address.length();

        int i = 0;

        while (i < n) {
            char c = address.charAt(i);
            if (c != '.') {
                sb.append(c);

            } else {
                sb.append("[.]");

            }
            i++;

        }

        return sb.toString();

    }
}