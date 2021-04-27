import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_5736 {

    public static int[] getOrder(int[][] tasks) {
        int len = tasks.length;
        int[] order = new int[tasks.length];
        if(tasks.length == 0){
            return order;
        }
        Queue<Integer> cpuQueue = new LinkedList<>();
        int curRunTime = 0;
        int curNeedTime = 0;
        cpuQueue.add(tasks[0][0]);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 2, 4 }, { 3, 2 }, { 4, 1 } };
        for (int x : getOrder(arr)) {
            System.out.println(x);
        }
    }
}
