package RECURSION_SERIES;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int s=0;
        int e=arr.length-1;
        System.out.println(Arrays.toString(isReverse(arr,s,e)));
    }
    static int[] isReverse(int[]arr,int s,int e){
        if(s>e){
            return arr;
        }
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        return isReverse(arr,s+1,e-1);
    }
}
