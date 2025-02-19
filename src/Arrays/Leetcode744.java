package Arrays;

public class Leetcode744 {
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return letters[start % letters.length];
    
        
    }

    public static void main(String[] args) {
        char[] arr = {'x','x','y'};
        char target = 'z';
        System.out.println(nextGreatestLetter(arr, target));
    }
    
}
