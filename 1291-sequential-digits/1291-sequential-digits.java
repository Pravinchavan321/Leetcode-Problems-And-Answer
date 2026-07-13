class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        StringBuilder sb = new StringBuilder(String.valueOf(low));
        List<Integer> list = new ArrayList<>();

        int i = 1;
        int lastElem = low;

        while (lastElem <= high) {
            int sbL = sb.length();

            while (i < sbL) {
                if (sb.charAt(i - 1) == '9')
                    break;

                sb.setCharAt(i, (char) (sb.charAt(i - 1) + 1));
                i++;
            }

            if (i < sbL) {
                if (sbL == 9)
                    break;

                sb = new StringBuilder();
                for (int j = 1; j <= sbL + 1; j++)
                    sb.append(j);

                i = 1;
                continue;
            }

            lastElem = Integer.parseInt(sb.toString());

            if (lastElem >= low && lastElem <= high)
                list.add(lastElem);

            if (sb.charAt(sbL - 1) == '9') {
                if (sbL == 9)
                    break;

                sb = new StringBuilder();
                for (int j = 1; j <= sbL + 1; j++)
                    sb.append(j);
            } else {
                sb.setCharAt(0, (char) (sb.charAt(0) + 1));
            }

            i = 1;
        }

        return list;
    }
}