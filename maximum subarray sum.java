class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE; // Corrected initialization
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxi = Math.max(sum, maxi); // Use Math.max() to compare
            
            if (sum < 0) { // Reset sum to 0 if it becomes negative
                sum = 0;
            }
        }
        return maxi;
    }
}
