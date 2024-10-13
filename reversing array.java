class ReversingArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;  // Adjust k to ensure it's within the bounds of the array length
        reverse(nums, 0, nums.length - 1);  // Reverse the entire array
        reverse(nums, 0, k - 1);            // Reverse the first k elements
        reverse(nums, k, nums.length - 1);  // Reverse the remaining elements
    }

    // Helper method to reverse a portion of the array
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Main method to test the rotate function
    public static void main(String[] args) {
        ReversingArray obj = new ReversingArray();
        
        int[] nums = {1, 2, 3, 4, 5, 6, 7};  // Example array
        int k = 3;  // Number of rotations
        
        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Rotate the array
        obj.rotate(nums, k);
        
        System.out.println("\nArray after " + k + " rotations:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
