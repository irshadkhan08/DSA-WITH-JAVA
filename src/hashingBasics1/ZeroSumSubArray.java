package hashingBasics1;

import java.util.HashMap;

public class ZeroSumSubArray {
    public static int sum(int[]a,int k){
        HashMap<Integer,Integer>map = new HashMap<>();

        int ans = 0;
        int sum  = 0;
        map.put(0,1);
        for(int i =0; i<a.length; i++){
            sum = sum+a[i];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return ans;
    }
    public static void main(String[] args) {
//        int a[] = {1,4,-3,2,1,2};
         int a[] = {10,5,7,1,2,5,3};

        //sum(a,0);
        System.out.println(sum(a,15));
    }
}
