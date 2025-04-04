package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    static void freq(int[] arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
                // map.put(key, value)
            }

            else
            {
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    
    public static void main(String args[]){  
   
        int arr[] = {10,5,10,15,10,5};
          int n = arr.length;
          freq(arr, n);
       }
}
