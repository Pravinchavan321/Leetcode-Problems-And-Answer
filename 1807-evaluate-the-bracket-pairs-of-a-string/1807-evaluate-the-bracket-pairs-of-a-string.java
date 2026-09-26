class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map<String, String> hashMap = new HashMap<>();

        int size = knowledge.size();
        for (int i = 0; i < size; i++) {
            hashMap.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        int strLen = sb.length();
        boolean startPar = false;
        int parStartIdx = -1;
        for (int i = 0; i < strLen; i++) {

            if (sb.charAt(i) == '(') {
                startPar = true;
                parStartIdx = i;
            } else if (sb.charAt(i) == ')') {
                startPar = false;
                result.append(hashMap.getOrDefault(sb.substring(parStartIdx + 1, i), "?"));
                parStartIdx = i;

            } else if (!startPar) {
                result.append(sb.charAt(i));

            }

        }

        return result.toString();

    }
}