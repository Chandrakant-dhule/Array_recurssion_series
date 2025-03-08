package RECURSION_SERIES;

public class SumDigitNum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(isSum(n));
    }

    static int isSum(int n) {
        if(n==0){
            return 0;
        }
        return n+isSum(n=n-1);
    }
}
