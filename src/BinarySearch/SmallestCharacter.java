package BinarySearch;
/**
 * In this we need to find out the cieling of a character in an array but the result should be in wrap around. That is if there is no character in the
 * given array then will provide the first character
 * @returns
 */
public class SmallestCharacter {
    public static void main(String[] args) {
        char[] arr = new char[]{'c', 'f', 'h', 'm', 'p'};
        char target = 'g';
        System.out.println(smallestCharacter(arr, target));
    }

    static int smallestCharacter(char[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start % arr.length;
    }
}
