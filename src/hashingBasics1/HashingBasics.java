package hashingBasics1;

import java.util.HashMap;
import java.util.HashSet;

public class HashingBasics {
    public static void main(String[] args) {

        HashMap<String,String>map = new HashMap<>();
        map.put("one","I");
        map.put("two","II");
        map.put("one","III");//update the value in HasMap 
        System.out.println(map);


        HashSet<Integer>set = new HashSet<>();
        set.add(34);
        set.add(3);
        set.add(4);
        set.add(3);//duplicate not allowed in set
        System.out.println(set);
    }
}
