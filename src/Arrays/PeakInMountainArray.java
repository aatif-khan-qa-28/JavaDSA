package Arrays;

public class PeakInMountainArray {
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

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,3,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
