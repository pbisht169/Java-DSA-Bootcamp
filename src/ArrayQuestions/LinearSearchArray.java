package ArrayQuestions;
/**
 * In Linear search Time complexity
 * 1. Best case is constant that is O(1), means we find the element at first position of array. Means it needs only 1 comparison.
 *      That means it does not matter the size of array.
 * 2. Worst case is, O(N), when we don't find the element in entire array after iterating(Scanning) through the whole array. Means we need to make N comparisons.
 * 3. Average Case is O(N).
 */
public class LinearSearchArray {

    public static void main(String[] args) {
        int[] arr = { 1,3,2,4,5,10, 9};
        System.out.print(linearSearch(arr, 30));
    }

    //    Search in the array, return the index if found otherwise return -1;
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //    Return the index value if found otherwise return the MAX value of INT
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    //    Return the true value if found otherwise return the false value
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
