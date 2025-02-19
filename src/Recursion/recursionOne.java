package Recursion;

public class recursionOne {

    static int cnt = 0;
        static void f(){

            //base condition
            if(cnt == 4){
            return;
        }
        
        System.out.println(cnt);
        cnt++;
        f();
    }
    public static void main(String[] args) {
        f();
    }
}
