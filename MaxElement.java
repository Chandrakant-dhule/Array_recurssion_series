package RECURSION_SERIES;

public class MaxElement {
    public static void main(String[] args) {
        int[]arr={10,20,30,50,2};
        int max=-1;
        int i=0;
        System.out.println(isMax(arr,max,i));
    }
    static int isMax(int[]arr,int max,int i){
        if(i==arr.length){
            return max;
        }
        if(arr[i]>max){
            max=arr[i];
        }
        return isMax(arr,max,i=i+1);
    }
}
