package RECURSION_SERIES;

public class Fibbonacci {
    public static void main(String[] args) {
        int n=7;
        System.out.println(isFibo(n));
    }
    static int isFibo(int n){
        if(n<2){
            return n;
        }
        return isFibo(n-1)+isFibo(n-2);
    }
}
