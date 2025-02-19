package Recursion;

public class printNtime {

    static void printGfg(int N) {
            // Base case: if N is less than or equal to 0, exit the function
            if (N <= 0) {
                return;
            } else {
                // Print "GFG" on the console
                System.out.print("GFG ");
    
                // Recursive call to print "GFG" N-1 times
                printGfg(N - 1);
            }
        }
    
        public static void main(String[] args) {
            printGfg(4);
    }
    
}
