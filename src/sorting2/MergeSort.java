package sorting2;

public class MergeSort {
    public static int mergeSort(int a[], int l, int h) {
        int count =0;
        if (l < h) {
            int mid = (l + h) / 2;
           count+= mergeSort(a, l, mid);
           count+= mergeSort(a, mid + 1, h);
             merge(a, l, mid, h);
        }
        return count;
    }
    public static void main(String[] args) {
        int a[] = {9, 7, 6, 4, 2, 1, 4};

       // mergeSort(a, 0, a.length-1);
        System.out.println( mergeSort(a, 0, a.length-1));
        for(int e :a){
            System.out.print(e+" ");
        }
    }
    public static void merge(int a[],int l,int mid, int h){
        int ans[] = new int[a.length];

        int i = l;// i is for left SubArray
        int j = mid+1;// j is for right subArray
        int k = l; // k is for b[]

        while(i<=mid && j<=h){

            if(a[i]<=a[j]){
                ans[k] = a[i];
                i++;
            }else{
                ans[k] = a[j];
                j++;
            }
            k++;
        }
//        if(i>mid){
            while(j<=h){
                ans[k] = a[j];
                k++;
                j++;
            }
//        }else{
            while(i<=mid){
                ans[k] = a[i];
                k++;
                i++;
            }
//        }

        for( i = l; i<=h; i++){
            a[i] = ans[i];
        }
    }
}