package Sorting;

public class SelectionSort {


    static void selection(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++) {
            {
                int mini = i;
                for (int j = i; j <= n - 2; j++) {
                    if (arr[j] < arr[mini]) {
                        mini = j;
                    }
                }
                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }

        }
    }

    static void bubble(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
    }

    static void insertion(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        int n = arr.length;

//        selection(arr, n);
//        bubble(arr, n);
        insertion(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
