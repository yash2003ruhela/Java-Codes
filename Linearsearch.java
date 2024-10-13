public class Linearsearch{

    static int searchInSorted(int arr[], int N, int K) {
        // Traverse the array to find the element K
        for(int i = 0; i < N; i++) {
            if(arr[i] == K) {  // If the element is found, return its index
                return i;
            }
        }
        // If the element is not found, return -1
        return -1;
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int N = arr.length;
        int K = 30;

        int result = searchInSorted(arr, N, K);
        System.out.println(result);  // Expected output: 2 (since 30 is at index 2)
    }
}
