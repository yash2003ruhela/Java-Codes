class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int a=0;
        for(int i=1;i<=n;i++){
            a=a^i;

        }
        for(int i=0;i<nums.length;i++){
            a=a^nums[i];

        }
        return a;
    }
}