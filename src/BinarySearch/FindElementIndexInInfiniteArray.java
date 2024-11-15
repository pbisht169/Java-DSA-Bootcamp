package BinarySearch;

public class FindElementIndexInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
        System.out.println(ans(arr, 20));
    }
    static int ans(int[] nums, int target) {
//        Find the correct range for the target element where it should get lies
        int start = 0;
        int end = 1;
        while(target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
            if(end > nums.length - 1) {
                end = nums.length - 1;
            }
        }
        int index = binarySearch(nums, target, start, end);
        return index;
    }
    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
//          int middle = (start + end)/2 , it could be that (start + end) can exceed the MAX_INTEGER range. So below method is used.
            int middle = start + (end - start)/2;
            if(arr[middle] > target) {
                end = middle - 1;
            } else if(arr[middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
