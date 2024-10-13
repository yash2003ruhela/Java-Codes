class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int num =0;
        for(int i=0;i<n;i++){
            num = (num^ nums[i]);
        }

        int rightMostSetBit = (num & (num-1)) ^ num;
        int b1 = 0;
        int b2 = 0;

        for(int i=0;i<n;i++){
            if((nums[i] & rightMostSetBit) !=0){
                b1 = b1 ^ nums[i];
            }else{
                b2 = b2 ^ nums[i];
            }
        }
        return new int[]{b1,b2};
    }
}