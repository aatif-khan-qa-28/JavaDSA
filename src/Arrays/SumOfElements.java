package Arrays;

public class SumOfElements {

    static int sum(int[] arr, int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {12,11,22,34,56,80};
        System.out.println(sum(arr, arr.length-1));
    }
    
}
