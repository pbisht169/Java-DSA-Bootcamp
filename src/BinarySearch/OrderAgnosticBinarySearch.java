package BinarySearch;

/*
    Order Agnostic Binary Search, in this we have the Sorted array, but we don't know that given array is Sorted in which order, either in Ascending or Descending.
    For that to check the Ascending or Descending we will compare the corner's element.
* */
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-10, -8, -7, 2, 4, 6, 8, 10};
        int target = 8;
        int[] arr1 = new int[]{10, 8, 6, 4, 2, -7, -8, -10};
        int target1 = -8;
        int index = orderAgnosticBinarySearch(arr, target);
        System.out.println(index);
        System.out.println(orderAgnosticBinarySearch(arr1, target1));
    }
    static int orderAgnosticBinarySearch(int[] arr, int target) {
//        Check whether the given array in Ascending or Descending

        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
//          int middle = (start + end)/2 , it could be that (start + end) can exceed the MAX_INTEGER range. So below method is used.

            int middle = start + (end - start)/2;
            if(arr[middle] == target) {
                return middle;
            }
            if(isAsc) {
                if(arr[middle] > target) {
                    end = middle - 1;
                } else  {
                    start = middle + 1;
                }
            } else {
                if(arr[middle] < target) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
