package RECURSION_SERIES;

public class StrongNumber {
    public static void main(String[] args) {
        int n=145;
        int s=n;
       // int i=1;
        isStrong(n,s);
    }
    static int sum=0;
    static void isStrong(int n,int s) {
        if(n==0)
        {
            if(sum==s){
                System.out.println("strong");
                return;
            }
            else{
                System.out.println("not");
                return;
            }
        }

        int rem=n%10;
        sum=sum+sumNume(rem);
        isStrong(n=n/10,s);
    }

    static int sumNume(int rem){
        int sum=1;
        while(rem!=0){
            sum=sum*rem;
            rem--;
        }
        return sum;
    }
}
