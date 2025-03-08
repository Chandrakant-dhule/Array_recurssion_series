package RECURSION_SERIES;

public class DuckRecursion {
    public static void main(String[] args) {
        int n=1202339;
        isduck(n);
    }
    private static void isduck(int n) {
        if(n==0){
            System.out.println("not");
            return;
        }
        if(n%10==0)
        {
            System.out.println("duck");
            return;
        }
        isduck(n=n/10);
    }
}
