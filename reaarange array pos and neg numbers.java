class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int num : nums) {
            if (num < 0) {
                ans[negativeIndex] = num;
                negativeIndex += 2;
            } else {
                ans[positiveIndex] = num;
                positiveIndex += 2;
            }
        }
        return ans;
    }
}
// //agr numbers posituve and negative equal length ke na de rakhe hue variety 2 
// for(int i=0;i<2;i++){
//     arr[i*2]=pos[i];
//     arr[i*2+1]=neg[i];
// }
// int ind=4;
// for(int i=2;i<pos.sixe;i++){
//     arr[ind]=pos[i];
//     ind++;
// }// yeh us ke liye jo numbers end me bach jaenge to unhe arr ke peche laga de
