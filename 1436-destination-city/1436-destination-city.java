class Solution {
    public String destCity(List<List<String>> paths) {

        Set<String> hashSet = new HashSet<>();

        int n = paths.size();
        String res = "";
        for (int i = 0; i < n; i++) {
            hashSet.add(paths.get(i).get(0));

        }
        for (int i = 0; i < n; i++) {
            if (!hashSet.contains(paths.get(i).get(1))) {
                res = paths.get(i).get(1);
                break;

            }

        }
        return res;

    }
}