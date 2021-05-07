package exercises;
public class LeetCode_74 {

    /**
     * 
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;
        if (target < matrix[0][0] || target > matrix[rows][cols]) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0]) {
                row++;
            }
        }

        if (row == -1) {
            return false;
        }

        int x = 0;
        int yPos = matrix[row].length - 1;
        int mid = 0;
        while (x <= yPos) {
            mid = x + (yPos - x >> 1);
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                x = mid + 1;
            } else {
                yPos = mid - 1;
            }
        }
        return false;
    }

    /**
     * 
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix1(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int column = matrix[0].length - 1;
        int r = row;
        int col = 0;
        while (r >= 0 && col <= column) {
            if (target < matrix[r][col]) {
                r--;
            } else if (target > matrix[r][col]) {
                col++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int[][] matrix2 = { { -5, -3, -1 }, { 10, 11, 16 }, { 16, 30, 34 } };
        int[][] matrix3 = { { 1 }, { 3 } };
        int[][] matrix4 = { { 1 } };
        int[][] matrix5 = { { -10, -10, -8, -7, -6 }, { -4, -4, -3, -2, 0 }, { 1, 1, 2, 2, 4 } };

        int target = 1;
        System.out.println(searchMatrix1(matrix5, 1));
    }
}
