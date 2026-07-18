class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n = distance.length;
        int forwardSum = 0;
        int backwardSum = 0;

        int i = start;           // forward pointer
        int j = start;           // backward pointer

        while (i != destination) {
            forwardSum += distance[i];
            i = (i + 1) % n;
        }

        while (j != destination) {
            j = (j - 1 + n) % n;    // move backward first
            backwardSum += distance[j];
        }

        return Math.min(forwardSum, backwardSum);
    }
}