package Basic;
//https://leetcode.com/problems/valid-palindrome/
public class stringPalindrome {

    static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    static boolean palindromeRecursive(int i, String s){

        // Base Condition
        // If i exceeds half of the string, means all the elements are compared, we return true.
        if(i>=s.length()/2) return true;

        // If start is not equal to end, not palindrome.
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        // If both characters are same, increment i and check start+1 and end-1.
        return palindromeRecursive(i+1,s);


    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String str2 = "abcba";
        System.out.println(isPalindrome(str));
//        System.out.println(palindromeRecursive(0,str2));
    }
}
