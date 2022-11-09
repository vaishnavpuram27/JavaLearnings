public class InfiniteArray {
    public static void main(String[] args) {
        // We don't use the arr.length function to mimic the infinite array
        int[] arr = {3,5,7,8,10,90,100,130,140,160,170,200,230,250,260,265,359,397,400};
        int target = 90;
        System.out.println(ans(arr,target));
    }
    static  int ans(int[] arr, int target){
        //first find the range
        //first start with a box of size 2 then increase the size exponentially
        int start =0;
        int end = 1;
        while(target>arr[end]){
            int newStart = end+1;
            end = end+2*(end-start+1);
            start = newStart;
        }
        return binarySearchAlgo(arr,target,start,end);
    }
    public static int binarySearchAlgo(int[] arr, int target,int startIdx,int endIdx){
        int start  = startIdx;
        int end = endIdx;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(target<arr[mid]){
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
