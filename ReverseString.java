package RECURSION_SERIES;

public class ReverseString {
    public static void main(String[] args) {
        String str="ABC";

        System.out.println(isReverse(str));
    }
    static String isReverse(String str){
       // StringBuilder sb=new StringBuilder();
        if(str==null || str.length()<=1){
            return str;
        }
        return isReverse(str.substring(1))+str.charAt(0);
    }
}
