package BinarySearch;

public class FirstAndLastOccurenceOfElement {
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,5,5,5, 6,6,6};
        int firstIndex = -1;
        int lastIndex = -1;
        firstIndex = findFirstAndLastOccurance(arr, 60, true);
        if(firstIndex != -1){
            lastIndex = findFirstAndLastOccurance(arr, 60, false);
        }

        System.out.println(firstIndex + " " + lastIndex);
    }
    static int findFirstAndLastOccurance(int[] arr, int target, boolean isFirstOccurence) {
        int start = 0, end = arr.length - 1;
        int firstIndex = -1;
        while(start <= end) {
//          int middle = (start + end)/2 , it could be that (start + end) can exceed the MAX_INTEGER range. So below method is used.
            int middle = start + (end - start)/2;
            if(arr[middle] > target) {
                end = middle - 1;
            } else if(arr[middle] < target) {
                start = middle + 1;
            } else {
                firstIndex = middle;
                if(isFirstOccurence) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }

            }
        }
        return firstIndex;
    }
}
