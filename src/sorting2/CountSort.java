package sorting2;

public class CountSort {
    public static int Max(int a[]){
        int max = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    public static void countSort(int a[]){
        int max = Max(a);
        int b[] = new int[max+1];

        for(int i = 0; i<b.length; i++){
            b[i] = 0;


        }
    }
    public static void main(String[] args) {
        int a[] = {3,1,9,7,1,2,4,-1};
        countSort(a);
//        int max = Integer.MIN_VALUE;
//
//        for(int i =0; i<a.length; i++){
//            if(a[i]>max){
//                max = a[i];
//            }
//        }
//        //int b[] = new int[max];
//        System.out.println(max);


    }
}
