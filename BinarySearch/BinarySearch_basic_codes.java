// class Solution {
//     public int search(int[] nums, int target) {
//         int low = 0;
//         int high = nums.length - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (nums[mid] == target) {
//                 return mid;
//             } else if (target > nums[mid]) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return -1;
//     }
// }


// import java.util.*;

// public class Solution {

//     public static int lowerBound(int []arr, int n, int x) {
//         int low = 0, high = n - 1;
//         int ans = n;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             // maybe an answer
//             if (arr[mid] >= x) {
//                 ans = mid;
//                 //look for smaller index on the left
//                 high = mid - 1;
//             } else {
//                 low = mid + 1; // look on the right
//             }
//         }
//         return ans;
//     }


//     import java.util.*;

// public class tUf {

//     public static int upperBound(int[] arr, int x, int n) {
//         int low = 0, high = n - 1;
//         int ans = n;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             // maybe an answer
//             if (arr[mid] > x) {
//                 ans = mid;
//                 //look for smaller index on the left
//                 high = mid - 1;
//             } else {
//                 low = mid + 1; // look on the right
//             }
//         }
//         return ans;
//     }


// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int st=0;
//         int ed=nums.length-1;
//         while (st <= ed) {
//             int mid = st + (ed - st) / 2;
            
//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 st = mid + 1;
//             } else {
//                 ed = mid - 1;
//             }
//         }
        
//         return st;
        
//     }
// }
