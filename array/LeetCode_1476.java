package array;

public class LeetCode_1476 {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 1 }, { 4, 3, 4 }, { 3, 2, 1 }, { 1, 1, 1 }, };
        int[][] arr2 = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        SubrectangleQueries sq = new SubrectangleQueries(arr2);
        System.out.println(sq.getValue(0, 0));
        sq.updateSubrectangle(0, 0, 2, 2, 100);
        System.out.println(sq.getValue(0, 0));
        System.out.println(sq.getValue(2, 2));
        sq.updateSubrectangle(1, 1, 2, 2, 20);
        System.out.println(sq.getValue(2, 2));


        // System.out.println(sq.getValue(0, 2));
        // sq.updateSubrectangle(0, 0, 3, 2, 5);
        // System.out.println(sq.getValue(0, 2));

        // sq.updateSubrectangle(3, 0, 3, 2, 10);
        // System.out.println(sq.getValue(3, 1));
        // System.out.println(sq.getValue(0, 2));
    }
}

class SubrectangleQueries {
    int[][] arr;

    public SubrectangleQueries(int[][] rectangle) {
        arr = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int row = row1; row <= row2; row++) {
            for (int col = col1; col <= col2; col++) {
                this.arr[row][col] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return arr[row][col];
    }
}
