package hashingBasics1;

import java.util.HashSet;

public class PairWithSum {
    class Pair {
        int x;
        int y;

        // Constructor
        public Pair(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
     static int pair(int arr[],int sum){

        HashSet<Integer>set = new HashSet<>();
         for(int e : arr){
             int comp = (sum-e);
             if(set.contains(comp)){
                 return e;
             }set.add(e);
         }
         return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,1,4,5,2,-1,4};
        int sum = 8;

        System.out.println(  pair(a,sum));

    }
}
