import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {-3,-5,-2,-32,53};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void selectionSort(int []arr){
        int len = arr.length;

        for (int i = 0; i <len; i++) {
            int lastIdx = len-i-1;
            int max = arr[0];
            int maxIdx = 0;
            for (int j = 0; j < len-i; j++) {
                if(arr[j]>max){
                    max = arr[j];
                    maxIdx = j;
                }
            }
            int temp = arr[maxIdx];
            arr[maxIdx] =arr[lastIdx];
            arr[lastIdx] = temp;

        }
    }
}
