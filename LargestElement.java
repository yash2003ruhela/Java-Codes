import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Corrected to read from System.in
        int n = sc.nextInt();  // Read the size of the array
        int a[] = new int[n];  // Initialize the array
        for (int i = 0; i < n; i++) {  // Fill the array with input values
            a[i] = sc.nextInt();
        }

        int l = a[0];  // Initialize l with the first element
        for (int i = 1; i < n; i++) {  // Start loop from 1 as l is already initialized with a[0]
            if (a[i] > l) {
                l = a[i];  // Update l if current element is greater
            }
        }

        System.out.println(l);  // Print the largest element
    }
}
