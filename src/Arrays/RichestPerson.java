package Arrays;
// https://leetcode.com/problems/richest-customer-wealth/submissions/1545981825

public class RichestPerson {
    public static int maximumWealth(int[][] accounts) {
    
            int ans = Integer.MIN_VALUE;
            for (int[] ints : accounts) {
                int sum = 0;
                for (int anInt : ints) {
                    sum += anInt;
                }
                if (sum > ans) {
                    ans = sum;
                }
            }
            return ans;
    
        }
    
        public static void main(String[] args) {
            int[][] account = { { 1, 0, 3 }, { 3, 9, 1 } };
            System.out.println(maximumWealth(account));
    }

}
