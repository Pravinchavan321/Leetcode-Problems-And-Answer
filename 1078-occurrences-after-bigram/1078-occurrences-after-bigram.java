class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        String[] strArr = text.split(" ");

        int n = strArr.length;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            if (strArr[i].equals(first) && strArr[i + 1].equals(second)) {
                list.add(strArr[i + 2]);

            }
        }

        String[] res = new String[list.size()];
        int i = 0;
        for (String s : list) {
            res[i++] = s;
        }

        return res;

    }
}