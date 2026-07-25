
//(1)

// class Solution 
// {
//     public String toLowerCase(String s) 
//     {

//         StringBuilder sb = new StringBuilder(s);
//         for(int i = 0; i < sb.length(); i++)
//         {
//             if(Character.isLetter(s.charAt(i)))
//             {
//                 if(Character.isUpperCase(s.charAt(i)))
//                 {
//                     sb.setCharAt(i,Character.toLowerCase(s.charAt(i)));

//                 }
//                 else
//                 {
//                     sb.setCharAt(i, s.charAt(i)); 
//                 }

//             }
//             else
//             {
//                 sb.setCharAt(i, s.charAt(i));

//             }

//         }

//         return sb.toString();

//     }
// }

//(2)
// class Solution 
// {
//     public String toLowerCase(String s) 
//     {

//         return s.toLowerCase();

//     }
// }

//(3)

class Solution {
    public String toLowerCase(String s) {

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if ((int) c < 92 && Character.isLetter(c)) {
                int newVal = c - 'A';

                sb.append((char) (newVal + 'a'));

            } else {
                sb.append(c);
            }

        }

        return sb.toString();

    }
}
