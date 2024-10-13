class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                maxi = Math.max(count, maxi); // Use Math.max
            } else {
                count = 0; // Reset count, but don't break the loop
            }
        }
        return maxi;
    }
}
