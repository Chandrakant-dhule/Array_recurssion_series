package RECURSION_SERIES;

public class CheckArraySort {
    public static void main(String[] args) {
        int[]arr={1,2,3,5,3};
        int i=0;
        isSort(arr,i);
    }
    static void isSort(int[]arr,int i){
        if(i==arr.length-1){
            System.out.println("sorted");
            return;
        }
        if(arr[i]>arr[i+1])
        {
            System.out.println("not");
            return;
        }
        isSort(arr,i+1);
    }
}
