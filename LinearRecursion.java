package RECURSION_SERIES;

public class LinearRecursion {
    public static void main(String[] args) {
       int[]arr={10,20,30,40,50};
       int target=90;
       int i=0;
        System.out.println(isLinear(arr,target,i));
    }
    static int isLinear(int[]arr,int target,int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }
        return  isLinear(arr,target,i=i+1);
    }
}
