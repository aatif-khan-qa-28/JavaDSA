package Recursion;

public class Reverse {
    
    // static void reverseArrayRec(int[] arr, int l, int r) {
    //     if (l >= r)
    //         return;

    //     int temp = arr[l];
    //     arr[l] = arr[r];
    //     arr[r] = temp;
  
    //     reverseArrayRec(arr, l + 1, r - 1);
    // }

    // // function to reverse an array
    // static void reverseArray(int[] arr) {
    //     int n = arr.length;
    //     reverseArrayRec(arr, 0, n - 1);
    // }

     //Function to print array
   static void printArray(int arr[], int n) {
    System.out.print("Reversed array is:- \n");
    for (int i = 0; i < n; i++) {
       System.out.print(arr[i] + " ");
    }
 }
 //Function to reverse array using recursion
 static void reverseArray(int arr[], int start, int end) {
    if (start < end) {
       int tmp = arr[start];
       arr[start] = arr[end];
       arr[end] = tmp;
       reverseArray(arr, start + 1, end - 1);
    }
 }

    public static void main(String[] args) {

        int n = 5;
      int arr[] = { 5, 4, 3, 2, 1};
      reverseArray(arr, 0, n - 1);
      printArray(arr, n);
        // int[] arr = { 1, 4, 3, 2, 6, 5 };

        // reverseArray(arr);
  
        // for (int i = 0; i < arr.length; i++) 
        //     System.out.print(arr[i] + " ");
    }
}
    

