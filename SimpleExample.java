package RECURSION_SERIES;

import java.util.Scanner;

public class SimpleExample {
    public static void main(String[] args) {
        int n=121;
        String s=String.valueOf(n);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
}
