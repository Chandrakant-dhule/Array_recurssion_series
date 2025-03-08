package RECURSION_SERIES;

public class PerfectNumber {
    public static void main(String[] args) {
        int n=6;
        int i=1;
        isPerfect(n,i);
    }

    static int sum=0;
    private static void isPerfect(int n,int i) {
        if(i==n){
            if(sum==n) {
                System.out.println("Perfect");
                return;
            }else{
                System.out.println("Not");
                return;
            }
        }
        if(n%i==0){
            sum=sum+i;
        }
        isPerfect(n,i=i+1);
    }
}
