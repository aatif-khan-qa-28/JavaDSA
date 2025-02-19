package Arrays;

public class ceiling {

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
            mid = start + (end - start) / 2;
        }
        return start;
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
            mid = start + (end - start) / 2;
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 12, 19};
        int target = 11;
        System.out.println("Ceiling of "+target+ " is at index: " + ceil(arr, target));
        System.out.println("Floor of "+target+ " is at index: " + floor(arr, target));
    }

}
