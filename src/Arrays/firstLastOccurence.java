package Arrays;

public class firstLastOccurence {
    static int firstOccurence(int[] nums, int target){
        int s= 0, e = nums.length-1;
        int mid = s + (e-s)/2;
        int ans = -1;

        while(s<=e){
            if(nums[mid] == target){
                ans = mid;
                e = mid - 1;
            }
            else if(target > nums[mid]){
                s = mid + 1;
            }
            else if(target < nums[mid]){
                e = mid - 1;
            }
            mid = s + (e-s)/2;

        }
        return ans;
    }
    static int lastOccurence(int[] nums, int target){
        int s= 0, e = nums.length-1;
        int mid = s + (e-s)/2;
        int ans = -1;

        while(s<=e){
            if(nums[mid] == target){
                ans = mid;
                s = mid + 1;
            }
            else if(target > nums[mid]){
                s = mid + 1;
            }
            else if(target < nums[mid]){
                e = mid - 1;
            }
            mid = s + (e-s)/2;

        }
        return ans;
    }
    
    
    static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };

        int first = firstOccurence(arr, target);
        int last = lastOccurence(arr, target);
        ans[0] = first;
        ans[1] = last;

        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,3,3,4,4,4,8,8,8,9,10};
        System.out.println(searchRange(nums, 8));
        
    }

}
