package Math;

public class CountDigit {

    static int countDigit(int n){
        int cnt = 0;
        int temp = n;
        while (temp > 0) {
            int last = temp % 10; 
            if (last != 0 && n % last == 0) { 
                cnt++;
            }
            temp /= 10;
        }

        return cnt;
    }

    static int countTwo(int n){
        int cnt = (int) (Math.log10(n) + 1);
        return cnt;

    }
    public static void main(String[] args) {
        System.out.println(countDigit(35));
        System.out.println(countTwo(35));
        
    }
}
