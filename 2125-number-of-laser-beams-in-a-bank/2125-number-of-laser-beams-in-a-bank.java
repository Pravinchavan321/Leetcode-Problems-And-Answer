class Solution {
    public int numberOfBeams(String[] bank) {

        int n = bank.length;
        if (n == 1) {
            return 0;
        }
        int count = 0;
        int sL = bank[0].length();
        int count1 = 0;
        int count2 = 0;

        for (int i1 = 0; i1 < n; i1++) {
            int i = 0;

            String s = bank[i1];
            while (i < sL) {

                if (s.charAt(i) == '1') {
                    count2++;
                }
                i++;

            }

            if (count1 == 0) {
                count1 = count2;
                count2 = 0;

            } else if (count1 != 0 && count2 != 0) {
                count = count + (count1 * count2);
                count1 = count2;
                count2 = 0;

            }

        }

        return count;

    }
}