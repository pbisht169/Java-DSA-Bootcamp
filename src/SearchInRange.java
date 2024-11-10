public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 1,3,2,4,5,10, 9};
        System.out.print(linearSearch(arr, 10, 2, 5));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
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
}
