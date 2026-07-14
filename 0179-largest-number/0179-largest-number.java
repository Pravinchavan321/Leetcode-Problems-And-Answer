class Solution {
    public String largestNumber(int[] nums) {

        PriorityQueue<String> maxHeap = new PriorityQueue<>((a, b) -> (b + a).compareTo(a + b));

        for (int num : nums) {
            maxHeap.offer(String.valueOf(num));
        }

        StringBuilder sb = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            sb.append(maxHeap.poll());
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}