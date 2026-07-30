class Solution {
    public int minimumPushes(String word) {

        int n = word.length();

        int pushes = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= 8) {
                pushes++;

            } else if (i > 8 && i <= 16) {
                pushes += 2;

            } else if (i > 16 && i <= 24) {
                pushes += 3;

            } else {
                pushes += 4;
            }

        }

        return pushes;

    }
}