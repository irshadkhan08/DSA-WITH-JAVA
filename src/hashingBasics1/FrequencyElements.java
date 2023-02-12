package hashingBasics1;

import java.util.HashMap;

public class FrequencyElements {
    public static void freq(int a[]){
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int e : a){
            if(map.containsKey(e)){
                 // int temp = map.get(e);
                //map.put(e,temp+1);
               // map.put(e,map.get(e)+1);
                map.put(e,map.getOrDefault(e,0)+1);
            }
            else{
                map.put(e,1);
            }
            //System.out.println(map);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int a[] = {1,2,1,2,3,4,2,3,7,7,7,7,7};
        freq(a);
    }
}
