package Arrays;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 9, 11, 12, 14, 20, 25, 26, 30 };
        System.out.println(binarySearch(arr, 12));
    }
}
