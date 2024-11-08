import java.util.*;

class Solution {
    // Helper function to calculate the sum of division values
    public int sumByD(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.ceil((double) num / div);
        }
        return sum;
    }

    // Method to find the smallest divisor given the threshold
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;

        // Find the maximum element in nums
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // Binary search for the smallest divisor
        int low = 1, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input threshold
        System.out.print("Enter the threshold: ");
        int threshold = scanner.nextInt();

        // Create a Solution object and call the smallestDivisor function
        Solution solution = new Solution();
        int result = solution.smallestDivisor(nums, threshold);

        // Output the result
        System.out.println("The smallest divisor is: " + result);

        scanner.close();
    }
}
