package RECURSION_SERIES;

public class NumberNtoOne {
    public static void main(String[] args) {
        int n=10;
        isPrintNum(n);
    }
    private static void isPrintNum(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        isPrintNum(n=n-1);
    }
}
