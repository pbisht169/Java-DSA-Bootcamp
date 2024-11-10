package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-10, -8, -7, 2, 4, 6, 8, 10};
        int target = 8;
        int index= binarySearch(arr, target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
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
