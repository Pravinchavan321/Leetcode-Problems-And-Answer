class Solution {
    public String defangIPaddr(String address) {

        String[] arr = address.split("\\.");
        int n = arr.length;
        String[] res = new String[7];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                res[j++] = arr[i];
                res[j++] = "[.]";

            } else {
                res[j] = arr[i];

            }

        }

        return String.join("", res);

    }
}