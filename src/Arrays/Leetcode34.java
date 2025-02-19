package Arrays;

public class Leetcode34 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 7, 7, 7, 8, 8, 8, 8, 8, 10 };
        int target = 8;
        System.out.println(searchRange(arr, target));

    }

    public static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };

        // check first occurence
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    static int search(int[] arr, int target, boolean findStartIdx) {
        int start = 0;
        int ans = -1;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                ans = mid;
                if (findStartIdx) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
