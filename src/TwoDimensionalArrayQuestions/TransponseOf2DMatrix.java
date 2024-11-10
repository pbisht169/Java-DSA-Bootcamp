package TwoDimensionalArrayQuestions;

public class TransponseOf2DMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
        };
//        We cannot do the in-place swapping as the  dimension are not same, means number of rows and columns can be different
        int matrix[][] = transpose(arr);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[matrix[0].length][matrix.length];
//        for (int col = 0; col < cols; col++) {
//            for (int row = 0; row < rows; row++) {
//                result[col][row] = matrix[row][col];
//            }
//        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
}



