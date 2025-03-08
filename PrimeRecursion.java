package RECURSION_SERIES;

public class PrimeRecursion {
    public static void main(String[] args) {
        int s=10;
        int n=2;
        System.out.println(isPrime(n,s));
    }
    static int sum=0;
    private static int isPrime(int n,int s) {
        if(n>s){
            return sum;
        }
        if(isChecke(n)){
            sum=sum+n;
        }
        return isPrime(n=n+1,s);
    }
    private static boolean isChecke(int n) {
        boolean flag=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
