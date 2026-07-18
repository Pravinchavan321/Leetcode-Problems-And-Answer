class Solution {
    public String generateTheString(int n) {

        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    sb.append("b");
                } else {
                    sb.append("a");

                }
            }

        } else {
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    sb.append("c");
                } else if (i == n - 2) {
                    sb.append("b");
                } else {
                    sb.append("a");

                }
            }

        }

        return sb.toString();

    }
}