package RECURSION_SERIES;

public class CountDown {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        isCountDown(n,i);
    }
     static void isCountDown(int n, int i) {
        if(i>n){
            return;
        }
         System.out.println(i);
        isCountDown(n,i=i+1);
    }
}
