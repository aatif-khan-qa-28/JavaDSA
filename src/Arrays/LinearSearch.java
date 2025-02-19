package Arrays;

public class LinearSearch {


    static int linearsearch(int[] arr, int k){

        if(arr.length == 0)
            return -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k)
                return i;
        
        }
                return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 0, 23, 9, 18 };
        int k = 18;
        System.out.println("Element " + k + " found at index: " + linearsearch(arr, k));

    }
}
