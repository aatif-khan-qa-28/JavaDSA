package Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {10,10,2,2,11,23,21,0};
        System.out.println(getSecondLargest(arr));
    }


    static int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // Edge case: If array has less than 2 elements
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        } else {
            return secondLargest;
        }
    }


}
