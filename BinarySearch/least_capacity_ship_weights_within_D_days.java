class Solution {
    public static int findDays(int[] weights, int cap) {
        int days = 1; // Start with the first day.
        int load = 0;
        for (int weight : weights) {
            if (load + weight > cap) {
                days++; // Move to the next day
                load = weight; // Start loading the new day's load
            } else {
                load += weight; // Load the weight on the same day
            }
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int weight : weights) {
            high += weight; // Sum of all weights (max capacity)
            low = Math.max(low, weight); // Max weight in the array
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= d) {
                high = mid - 1; // Try to find a smaller capacity
            } else {
                low = mid + 1; // Increase capacity
            }
        }
        return low;
    }

    public int shipWithinDays(int[] weights, int days) {
        return leastWeightCapacity(weights, days);
    }
}