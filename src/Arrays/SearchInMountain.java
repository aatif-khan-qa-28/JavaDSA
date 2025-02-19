package Arrays;

public class SearchInMountain {

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }

        //try to search in second half
        return binarySearch(arr, target, peak+1, arr.length-1);



    }
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while(s < e){
            int mid = s + (e - s) / 2;

            if(arr[mid] > arr[mid+1])
            {   
            // decreasing part of array
            // this may be the ans, but look left hand side
            // this is why end =! mid-1
                e = mid;
            }
            else if (arr[mid] < arr[mid+1])
            {
                // asc part of the array
                s = mid + 1;
            }
        }
         // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return s; // or return end as both are =
        
        
    }

    static int binarySearch(int arr[], int start, int end, int x) {

        // Checking the sorted order of the given array
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;

            // Check if x is present at mid
            if (arr[middle] == x)
                return middle;

            // Ascending order
            if (isAsc == true) {

                // If x greater, ignore left half
                if (arr[middle] < x)
                    start = middle + 1;

                // If x smaller, ignore right half
                else
                    end = middle - 1;
            }

            // Descending order
            else {

                // If x smaller, ignore left half
                if (arr[middle] > x)
                    start = middle + 1;

                // If x greater, ignore right half
                else
                    end = middle - 1;
            }
        }

        // Element is not present
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,3,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
