package RECURSION_SERIES;

public class FACTORIAL {
    public static void main(String[] args) {
        int n=5;
        System.out.println(ifFact(n));
    }
    static int ifFact(int n){
        if(n==1){
            return 1;
        }
        return  n*ifFact(n=n-1);
    }
}
