
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to handle duplicates easily
        boolean[] used = new boolean[nums.length];  // Keep track of used elements
        backtrack(result, new ArrayList<>(), nums, used);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));  // Add a copy of the current permutation
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicates by checking the sorted array and used[i-1]
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);  // Remove the last element (backtracking)
        }
    }
}
