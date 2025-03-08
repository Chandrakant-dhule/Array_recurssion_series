package RECURSION_SERIES;

public class FibonacciNum {
    public static void main(String[] args) {
        int n=6;
        int a=0;
        int b=1;
        int count=2;
        System.out.print(a+" "+b+" ");
        isFibo(n,a,b,count);
    }
    static void isFibo(int n,int a,int b,int count){
        if(count>n){
            return;
        }
        System.out.print(a+b+" ");
        isFibo(n,b,a+b,count+1);
    }
}
