import java.util.*;

 class Books_allocation {
    public static int countStudents(List<Integer> arr, int pages) {
        int students = 1, pagesStudent = 0;
        for (int book : arr) {
            if (pagesStudent + book > pages) {
                students++;
                pagesStudent = book;
            } else {
                pagesStudent += book;
            }
        }
        return students;
    }

    public static int findPages(List<Integer> arr, int m) {
        if (m > arr.size()) return -1;
        int low = Collections.max(arr), high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            if (countStudents(arr, mid) > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(25, 46, 28, 49, 24);
        int m = 4;
        System.out.println("The answer is: " + findPages(arr, m));
    }
}
