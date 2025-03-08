package RECURSION_SERIES;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        int target=30;
        int s=0;
        int e=arr.length-1;
        System.out.println(isBinary(arr,s,e,target));
    }
    static int isBinary(int[]arr,int s,int e, int target) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return isBinary(arr, s, mid - 1, target); // Search in the left half
        } else {
            return isBinary(arr, mid + 1, e, target); // Search in the right half
        }
    }
}
