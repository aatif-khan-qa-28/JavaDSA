package Arrays;

import java.util.Scanner;

public class Hashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute:
        int[] hash = new int[13];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = sc.nextInt(); // no of queries
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println("No of time " + number + " appears: " + hash[number]);
        }
    }
}
