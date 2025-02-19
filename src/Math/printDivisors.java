package Math;

public class printDivisors {

    static int printDivisorsSum(int n) {

        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (n / i != i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }

    static int sumOfDivisors(int N) {
        int sum = 0;

        for (int i = 1; i <= N; ++i) {
            int x = (int) Math.sqrt(i);

            // Find all divisors of i and add them
            for (int j = 1; j  <= x; ++j) {
                if (i % j == 0) {
                    if (i / j == j)
                        sum += j;
                    else
                        sum += j + i / j;
                }
            }
        }

        return sum;
    }

    // static void optimalDivisor(int n) {
    // for (int i = 1; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // System.out.println(i);
    // if (n / i != i) {
    // System.out.println(n / i);
    // }
    // }
    // }
    // }

    // static ArrayList<Integer> divisors(int n) {
    // ArrayList<Integer> divisors = new ArrayList<>();
    // int sqrtN = (int) Math.sqrt(n);
    // for (int i = 1; i <= sqrtN; i++) {
    // if (n % i == 0) {
    // divisors.add(i);
    // if (i != n / i) {
    // divisors.add(n / i);
    // }
    // }

    // }
    // return divisors;
    // }

    public static void main(String[] args) {
        System.out.println(sumOfDivisors(6));
        // int number = 36;
        // ArrayList<Integer> divisors = divisors(number);

        // System.out.print("Divisors of " + number + " are: ");
        // for (int divisor : divisors) {
        // System.out.print(divisor + " ");
        // }
        // System.out.println();
    }

}
