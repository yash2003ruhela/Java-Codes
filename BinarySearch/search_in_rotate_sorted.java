class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if the middle element is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine if the left side is sorted
            if (nums[low] <= nums[mid]) {
                // Check if the target is within the sorted left side
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // If the right side is sorted
            else {
                // Check if the target is within the sorted right side
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        // Return -1 if the target is not found
        return -1;
    }
}
