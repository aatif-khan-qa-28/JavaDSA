package Arrays;

public class SearchinStrings {
    static boolean search(String str, char k){
        if(str.length() == 0)
            return false;

        for (char ch  : str.toCharArray()) {
            if( ch == k)
                return true;
            
        }

        return false;
    }

    static boolean searchInRange(String str, char k, int s, int e){
        if(str.length() == 0)
            return false;

        for(int i = s; i <= e; i++){
            if(k == str.charAt(i)){
                return true;
            }
        }
        return false;
            
    }

    public static void main(String[] args) {
        String name = "Aatifkhanswe";
        char k = 'w';
        // System.out.println(search(name, k));
        System.out.println(searchInRange(name, k, 1, 5));
    }
}
