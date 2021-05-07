package exercises;
import java.util.Stack;

//先实现如何控制方向
public class LeetCode874 {
    public static int robotSim(int[] commands, int[][] obstacles) {
        int res = 0;
        // 北东南西
        int[] orientation = { 1, 2, 3, 4 };
        int defaultOrientation = orientation[0];
        int pos = 0;
        int size = commands.length;
        while (pos++ < size) {
            if(-1 == commands[pos]){

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] commands = { 4, -1, 4, -2, 4 };
        int[][] obstacles = { { 2, 4 } };
        System.out.println(robotSim(commands, obstacles));
    }
}
