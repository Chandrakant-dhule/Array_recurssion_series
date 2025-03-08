package RECURSION_SERIES;

public class CountDigit {
    public static void main(String[] args) {
        int n=123;
        int count=0;
        System.out.println(isCountDigit(n,count));
    }
    static int isCountDigit(int n,int count){
        if(n==0)
        {
            return count;
        }
        return isCountDigit(n=n/10,count=count+1);
    }
}
