import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array");
        n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter a sorted array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
            int target ;
            System.out.println("Enter a target element");
            target = sc.nextInt();
            int pos = binarySearch(arr,target);
            if(pos!=-1)
                System.out.println(target+" is in position "+pos);
            else
                System.out.println(target+" is not in the array");



    }
    // return the index
    static int binarySearch(int[] arr,int target){
        int start  = 0;
        int end = arr.length-1;
        while (start<=end){
            //find the middle element
            int mid = start + (end-start)/2;
            // the above formula is used when the values are out of range and will throw an error.

            if(target < arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;

            }else {
                return mid;
            }

        }
        return -1;
    }
}