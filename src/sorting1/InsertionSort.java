package sorting1;

public class InsertionSort {
    public static void insertion(int a[]){
      //6,7,3,2,1
        //left part sorted h to usko right side push karo do left wale j-i ke m dale do
        //6>7
        for(int i =1; i<a.length; i++){
            int j = i-1;//
            int temp = a[i];//7
            for(; j>=0; j--){
                if(a[j]>temp){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = {6,7,3,2,1};

        insertion(a);
        for(int e : a){
            System.out.println(e);
        }
    }
}
