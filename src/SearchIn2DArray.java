import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                { 2,3,4,5 },
                { 10, 11, 12,13,14},
                { 100, 110, 120,130,140},
        };
        int target = 140;
        int index[] = search2D(arr, target);
        System.out.println(Arrays.toString(index));
        int max = maximumvalue(arr);
        System.out.println(max);
    }

    static int[] search2D(int arr[][], int target) {
        for(int row = 0; row < arr.length; row++) {
            for(int j = 0; j < arr[row].length; j++) {
                if(target == arr[row][j]) {
                    return new int[]{row, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int maximumvalue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++) {
            for(int j = 0; j < arr[row].length; j++) {
                if(max < arr[row][j]) {
                    max = arr[row][j];
                }
            }
        }
        return max;
    }
}
