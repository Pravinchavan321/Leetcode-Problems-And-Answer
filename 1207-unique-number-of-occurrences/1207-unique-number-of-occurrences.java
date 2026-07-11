class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        Set<Integer> hashSet = new HashSet<>();

        int n = arr.length;

        for (int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        for (int no : hashMap.keySet()) {
            int freq = hashMap.get(no);
            if (!hashSet.contains(freq)) {
                hashSet.add(freq);

            } else {
                return false;
            }

        }

        return true;

    }
}