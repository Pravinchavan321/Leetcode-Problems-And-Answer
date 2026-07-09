class Solution {
    public boolean isLongPressedName(String name, String typed) {

        char[] nA = name.toCharArray();
        char[] tA = typed.toCharArray();
        int nL = nA.length;
        int tL = tA.length;
        if (tL < nL) {
            return false;
        }
        if(nA[0] != tA[0])
        {
            return false;
        }

        int i = 1;
        int j = 1;
        int count = 0;
        count++;
        while (i < nL && j < tL) {
            if (nA[i] == tA[j]) {
                i++;
                j++;
                count++;
            } else {
                if(nA[i - 1] == tA[j])
                {
                    j++;
                }
                else
                {
                    return false;
                }

            }
        }

        while(j < tL)
        {
            if(tA[j] != nA[nL - 1])
            {
                return false;
            }
            j++;
        }

        return count == nL ? true : false;

    }
}