package hashingBasics1;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int a[] = {1,2,3,3,3,4,4,5};
        int count = 0;
        HashSet<Integer>set = new HashSet<>();

        for(int e : a){
            set.add(e);
        }
        System.out.println(set);
        System.out.println(set.size());





//        boolean flag = false;
//        for(int e : a){
//            if(set.add(e)==false){
//                System.out.println(set);
//                flag = true;
//            }
//        }
//        if(flag==false){
//            System.out.println();
//        }
//        System.out.println(set.size());
    }
}
