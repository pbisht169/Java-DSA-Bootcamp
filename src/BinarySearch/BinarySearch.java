package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,10};
        int target = 8;
        int index= binarySearch(arr, target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while(start <= end) {
            int middle = start + (end - start)/2;
            if(arr[middle] == target) {
                return middle;
            }
            if(arr[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
