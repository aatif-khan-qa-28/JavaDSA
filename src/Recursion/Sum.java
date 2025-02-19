package Recursion;

import java.util.Scanner;

public class Sum {
     static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
     }

     static int sumNew(int n){
      if(n == 0)
         return 0;
      return (n*n*n + sumNew(n-1));
     }

     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sumNew(n));
        s.close();
     }
}
