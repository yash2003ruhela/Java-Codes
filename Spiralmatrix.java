
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        int left = 0, right = m-1;
        int top = 0, bottom = n-1;

        while(top <= bottom && left <= right){
            // left to right
            for(int i=left ; i<=right ; i++)
                ans.add(mat[top][i]);
            top++;
            // top to bottom
            for(int i=top ; i<=bottom ; i++)
                ans.add(mat[i][right]);
            right--;
            //right to left covering edge cases
            if(top<=bottom){
                for(int i=right ; i>=left ; i--)
                    ans.add(mat[bottom][i]);
            bottom--;
            }
            //bottom to top covering edge cases
            if(left<=right){
                for(int i=bottom ; i>=top; i--)
                    ans.add(mat[i][left]);
            left++;        
            }
        }
        return ans;
        
    }
}