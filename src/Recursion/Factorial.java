package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {
    static int fact(long n) {
            if (n == 0) {
                return 1;
            }
    
            return (int) (n * fact(n - 1));
    }

    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> ans = new ArrayList<>();
        long fact = 1;
        int x = 2;

        while (fact <= n) {
            // Adding factorial to the answer list.
            ans.add(fact);

            // Calculating next factorial by multiplying with next number.
            fact *= x;
            x++;
        }
        // Returning the list of factorial numbers.
        return ans;   
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factorialNumbers(n));
        s.close();
    }
}

