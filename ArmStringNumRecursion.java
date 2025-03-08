package RECURSION_SERIES;

public class ArmStringNumRecursion {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        int count=isCount(n);
        System.out.println(isArmostrong(n,sum,count));
    }
    private static int isArmostrong(int n,int sum,int count)
    {
            if(n==0){
                return sum;
            }
            int rem=n%10;
            sum+=isCalculate(count,rem);
            return isArmostrong(n=n/10,sum,count);
    }
    private static int isCalculate(int count, int rem) {
        int i=1;
        int s=1;
        while(i<=count)
        {
            s=s*rem;
            i++;
        }
        return s;
    }

    private static int isCount(int n) {
        int count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        return count;
    }
}// end
