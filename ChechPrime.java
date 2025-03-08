package RECURSION_SERIES;

public class ChechPrime {
    public static void main(String[] args) {
        int n=11;
        int i=2;
        System.out.println(isprime(n,i));
    }
    static boolean isprime(int n,int i){
        if(i==n){
            return true;
        }
        if(n%i==0){
            return false;
        }
        return isprime(n,i=i+1);
    }
}
