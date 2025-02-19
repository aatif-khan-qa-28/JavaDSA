package Arrays;

public class Maxitem {
       static int max(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static int min(int[] arr) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }

    static int maxrange(int[] arr, int s, int e) {

        if (e > s)
            return -1;
        if (arr == null)
            return -1;
        int maxi = Integer.MIN_VALUE;
        for (int i = s; i <= e; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }


    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 0, 23, 9, 18 };
        // System.out.println(maxrange(arr, 0,3));
        System.out.println(min(arr));
    }

}
