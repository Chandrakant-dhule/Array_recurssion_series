package RECURSION_SERIES;

public class GCD {
    public static void main(String[] args) {
        int n1=32;
        int n2=6;
        int k=(n1*n2);
        System.out.println(k/isGcd(n1,n2));
    }
    private static int isGcd(int n1, int n2) {
        if(n2==0){
            return n1;
        }
        return isGcd(n2,n1%n2);
    }
}
