package RECURSION_SERIES;

import AbstarctDemo.A;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
     int[][]arr1={{1,2},
                {3,4}};
     int[][]arr2={{5,6},
                 {7,8}};
     int[][]result=new int[arr1.length][arr2[0].length];
     for(int i=0;i<arr1.length;i++){
         for(int j=0;j<arr2[0].length;j++){
             for(int k=0;k<arr1[0].length;k++){
                 result[i][j]+=arr1[i][k]*arr2[k][j];
             }
         }
     }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                System.out.print(result[i][j]+" " +
                        "3");
            }
            System.out.println();
        }

    }
}
