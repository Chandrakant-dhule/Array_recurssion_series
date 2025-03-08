package RECURSION_SERIES;

public class HappyRecursion {
    public static void main(String[] args) {
        int n = 13;
        boolean isHappy = isHappy(n);
        System.out.println(isHappy ? "Happy" : "Not Happy"); // Output the result
    }
    private static boolean isHappy(int n)
    {
        if (n == 1) {
            return true;
        }

        if (n == 4) {
            return false;
        }

        int sum = sumOfSquares(n, 0); //
        return isHappy(sum);
    }

    private static int sumOfSquares(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum += rem * rem;
        return sumOfSquares(n / 10, sum);
    }
}
