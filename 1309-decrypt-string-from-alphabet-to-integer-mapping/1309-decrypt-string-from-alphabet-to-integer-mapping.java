
//(1)

// class Solution {
//     public String freqAlphabets(String s) {
//         StringBuilder sb = new StringBuilder();

//         // Use -1 so we don't lose the final chunk if the string ends with '#'
//         String[] arr = s.split("\\#", -1); 

//         for (int j = 0; j < arr.length; j++) {
//             int len = arr[j].length();

//             // Skip empty chunks (happens if the string ends in '#')
//             if (len == 0) continue; 

//             // If this is NOT the last chunk in the array, it originally had a '#'
//             if (j != arr.length - 1) {

//                 // 1. Process all characters EXCEPT the last two as single digits
//                 for (int i = 0; i < len - 2; i++) {
//                     sb.append((char) ((Integer.parseInt(arr[j].substring(i, i + 1)) - 1) + 'a'));
//                 }

//                 // 2. Process the last two characters as a double digit (Your idea!)
//                 sb.append((char) ((Integer.parseInt(arr[j].substring(len - 2, len)) - 1) + 'a'));

//             } else {
//                 // If this IS the last chunk, it didn't have a '#', so ALL are single digits
//                 for (int i = 0; i < len; i++) {
//                     sb.append((char) ((Integer.parseInt(arr[j].substring(i, i + 1)) - 1) + 'a'));
//                 }
//             }
//         }

//         return sb.toString();
//     }
// }

//(2)

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        // Loop backwards starting from the end of the string
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '#') {
                // If we see a '#', grab the two digits immediately before it
                int val = Integer.parseInt(s.substring(i - 2, i));
                sb.append((char) (val - 1 + 'a'));

                // Skip the two digits we just processed
                i -= 2;
            } else {
                // If it's not a '#', it's a single digit. 
                // We can convert the char to an int directly using ascii math
                int val = s.charAt(i) - '0';
                sb.append((char) (val - 1 + 'a'));
            }
        }

        // Because we built the string backwards, we just reverse it at the end!
        return sb.reverse().toString();
    }
}