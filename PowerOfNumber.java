package RECURSION_SERIES;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base=5;
        int index=3;
        System.out.println(isPower(base,index));
    }
    static int fact=1;
    static int isPower(int base,int index){
        if(index==0)
        {
            return fact;
        }
        fact=fact*base;
        return isPower(base,index=index-1);
    }
}
