public class Floor {
    public static void main(String[] args){
        int [] arr = {2,3,5,6,8,14,16,18};
        int target = 10;
        int res =celing(arr,target);
        System.out.println(res);
         

    }
    static  int celing(int [] arr,int target){
        if(target<arr[0])
            return -1;
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
                return arr[mid];
            }

        }
        return arr[end];
    }
}