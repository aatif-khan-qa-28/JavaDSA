package Arrays;

public class PivotElement {
    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        int mid = s + (e-s)/2;

        while(s < e){
            if(arr[mid] < arr[mid+1])
                s = mid + 1;
            else
                e = mid;

            mid = s + (e-s)/2;
        }

        return s;
    }
    
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(findPivot(arr));
    }
}
