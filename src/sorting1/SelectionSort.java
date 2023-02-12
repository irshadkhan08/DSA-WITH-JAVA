package sorting1;

public class SelectionSort {
    public static void selectionSort(int a[]){
        //{8,1,9,3,4}

        for(int i=0; i<a.length; i++){
            int sort = a[i];


//            for(int j = 0; j<a.length; j++){
////                if(sort>a[i]){
////                    int temp = sort;
////                    sort = a[i];
////                    a[i] = sort;
////                }
//            }
        }
    }
    public static void main(String[] args) {
        int a[] = {8,1,9,3,4};
           selectionSort(a);
           for(int e: a){
               System.out.println(e);
           }
    }
}
