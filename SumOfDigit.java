package RECURSION_SERIES;

public class SumOfDigit {
    public static void main(String[] args) {
       int n=1234;
        System.out.println(isSumOfDidit(n));
    }
    static  int sum=0;
    static int isSumOfDidit(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum+rem;
        return isSumOfDidit(n=n/10);
    }

}
