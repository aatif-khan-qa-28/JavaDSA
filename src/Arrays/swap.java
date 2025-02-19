package Arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int arr[] = {1,3,23,9,18};
        // swapF(arr, 1,4);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        
   
    }

    static void swapF(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end =arr.length-1;

        while(start < end){
            swapF(arr, start, end);
            start++;
            end--;
        }
     

    }
    
}
