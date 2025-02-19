package Basic;

import java.util.Scanner;

public class fibonacci {

    static int nthFibonacci(int n){

        // base case: f(n) = n for n = 0 or n = 1
        if (n <= 1){
            return n;
        }

        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter which fibonacci number is reqd: ");
        int n = in.nextInt();
        System.out.println("Corresponding fibonacci number is: " + nthFibonacci(n));
        in.close();
    }
    
}
