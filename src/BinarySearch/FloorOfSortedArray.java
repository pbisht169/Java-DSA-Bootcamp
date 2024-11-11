package BinarySearch;

public class FloorOfSortedArray {

/**
 *  Floor of Array : Biggest element in Array which is equal or smaller to the target element.
 *  In this we return the end instead of -1, if no number is found, which is equal to target element.
 *  In This Question our intuition behind it to return the end element, is that, we think it as out answer/target lie between the start and end. like below
 *  start - target/ans - end
 *  if it lies between start and end, means start = end + 1, then we directly return it, but what if target/answer doesn't lies in between start and end. Means it lies outside the start and end.
 *  means out loop condition got violated as
 *  end - target/answer - start. therefore the end lies outside the target/answer, and it is immediately smaller than the target/answer
 *  Therefore we return the end element in it.
 * */

    public static void main(String[] args) {
        int[] arr = new int[]{-10, -8, -7, 2, 4, 6, 8, 10};
        int target = -11;
        int index= ceilingOfArray(arr, target);
        System.out.println(index);
    }
    static int ceilingOfArray(int [] arr, int target) {
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
        return end;
    }
}

