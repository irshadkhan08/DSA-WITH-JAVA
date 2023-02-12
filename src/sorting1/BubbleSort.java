package sorting1;

public class BubbleSort {
    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void bubble(int a[]){
        int count = 0;
       for(int i = 0; i<a.length-1; i++){
           boolean sort = false;
           for(int j = 0; j<a.length-i-1; j++){
               if(a[j]>a[j+1]){
                   sort = true;
                 swap(a,j,j+1);
               }
           }
           if(!sort)break;
       }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int a[] = {9,5,2,6,3,1,3};
        bubble(a);
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
