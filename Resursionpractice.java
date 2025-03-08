package RECURSION_SERIES;

public class Resursionpractice {
    public static void main(String[] args) {
       int n=153;
       int count=checkcount(n);
       int s=chekArm(n,count);
        System.out.println(s);
    }
    static int sum=0;
    static int chekArm(int n,int count){
        if(n==0){
            if(sum==153){
                System.out.println("arm");
                return sum;
            }
        }
        int rem=n%10;
        sum=sum+cheA(rem,count);
        return chekArm(n/10,count);
    }
    static int cheA(int base,int index){
        int sum=1;
        for(int i=1;i<=index;i++){
            sum=sum*base;
        }
        return sum;
    }




    static int checkcount(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
}
