package BinarySearch;
//Mountain array also called Bio-tonic array
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,6,8,7,5,0};
        int target = 8;
        int index= peakIndexInMountainArray(arr);
        System.out.println(index);
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
