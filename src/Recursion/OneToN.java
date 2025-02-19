package Recursion;

import java.util.Scanner;

public class OneToN {


    static void printF(int i, int N){
        if(i > N){
            return;
        }
        else{
            System.out.println(i);
            printF(i+1, N);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        printF(1, N);

    }
    
}
