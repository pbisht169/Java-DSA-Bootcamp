public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = { 1,1,1};
        System.out.println(findMax(arr));
        System.out.print(findMin(arr));
    }

    static int findMax(int[] arr) {
        if(arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int findMin(int[] arr) {
        if(arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
