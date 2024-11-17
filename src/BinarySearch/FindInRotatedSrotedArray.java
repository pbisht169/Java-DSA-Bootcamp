package BinarySearch;

public class FindInRotatedSrotedArray {
    public static void main(String[] args) {
    int[] arr = {3,5,1};


        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int pivotIndex = pivot(arr);

        if(pivotIndex == -1){
//        If array is not Rotated then do the normal binary Search
            return binarySearch(arr, target, 0, arr.length-1);
        } else {
            if(arr[pivotIndex] == target){
                return pivotIndex;
            }
            if(arr[0] <= target){
                return binarySearch(arr, target, 0, pivotIndex);
            } else {
                return binarySearch(arr, target, pivotIndex + 1, arr.length-1);
            }
        }
    }

//    In this pivot method we try to find the highest element in the rotated sorted array.
    static int pivot(int[] arr)  {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start)/2;
            if(middle < end && arr[middle] > arr[middle + 1]) {
                return middle;
            } else if(middle > start && arr[middle] < arr[middle - 1]) {
                return middle - 1;
            } else if(arr[start] >= arr[middle]) {
//                Means we are in Right section of array
//                If the middle is pivot, then it must get caught in 1 & 2 checks, therefore we don't need to use end = middle
                end = middle - 1;
            } else {
//                Means we are in left section of array
//                If the middle is pivot, then it must get caught in 1 & 2 checks, therefore we don't need to use end = middle
                start = middle + 1;
            }
        }
//        Pivot = -1 means the array is not rotated.
        return -1;
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
