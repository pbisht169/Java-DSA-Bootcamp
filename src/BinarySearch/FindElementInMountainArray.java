package BinarySearch;

public class FindElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int target = 5;

        int index = findPeak(arr, target);
        System.out.println(index);
    }

    static int findPeak(int[] arr, int target) {
        int peakIndex= peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, 0, peakIndex, target );
        if(firstTry == -1){
            firstTry = orderAgnosticBinarySearch(arr, peakIndex+1, arr.length-1, target);
        }
        return firstTry;
    }

    static int orderAgnosticBinarySearch(int[] arr, int start, int end, int target) {
//        Check whether the given array in Ascending or Descending
        boolean isAsc = arr[start] < arr[end];
//        int start = 0, end = arr.length - 1;
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

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start < end) {
//          int middle = (start + end)/2 , it could be that (start + end) can exceed the MAX_INTEGER range. So below method is used.
            int middle = start + (end - start)/2;
            if(arr[middle] > arr[middle + 1]) {
                // You are in decreasing(Right) part of array,
                // Middle Element, may be the answer so look at left(increasing part) but include the middle also.
//                This is why   end != middle - 1
                end = middle;
            } else {
//                We are in ascending part of array. So we don't need to check the middle element again, in next iteration
                start = middle + 1; // Because we know that arr[mid + 1] > arr[mid]
            }
        }
//        In the end, end == start and pointing to the largest number because of the 2 checks above
//        Start and end always try to find the max element in above 2 checks
//        hence when they're pointing to one element, they are pointing to max element
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start;
    }
}
