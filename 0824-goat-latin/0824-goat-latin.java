class Solution {
    public String toGoatLatin(String sentence) {

        String[] arr = sentence.split("\\s+");

        int n = arr.length;
        StringBuilder sRes = new StringBuilder();

        for (int i = 0; i < n; i++) {

            StringBuilder sb = new StringBuilder(arr[i]);
            char c = arr[i].charAt(0);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                sb.append("ma");

            } else {

                sb.deleteCharAt(0);
                sb.append(c);
                sb.append("ma");
            }

            for (int j = 0; j <= i; j++) {
                sb.append('a');
            }

            sRes.append(sb);

            if (i != n - 1) {
                sRes.append(" ");
            }
        }

        return sRes.toString();
    }
}