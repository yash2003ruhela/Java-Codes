// class Solution {
//     public boolean search(int[] nums, int target) {
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(nums[i]==target)
//             return true;
//         }
//         return false;
//     }
// } LINEAR SEARCH 
// now by doing this same as BINARY SEARCH
class Solution {
    public boolean search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid points to the target
            if (arr[mid] == target) {
                return true;
            }

            // Handle edge case where elements at low, mid, and high are equal
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // If left part is sorted
            if (arr[low] <= arr[mid]) {
                // Check if target is in the left sorted part
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            // If right part is sorted
            else {
                // Check if target is in the right sorted part
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        // Return false if target is not found
        return false;
    }
}
