class Solution {
    public List<String> stringMatching(String[] words) {

        Set<String> hashSet = new HashSet<>();
        List<String> list = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && words[i].contains(words[j])) {
                    hashSet.add(words[j]);
                }
            }
        }

        for (String num : hashSet) {
            list.add(num);
        }

        return list;

    }
}