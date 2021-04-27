import java.util.ArrayList;

public class LeetCode_5727_Josephus_Circle {

    /**
     * 迭代反着推
     * 
     * @param n
     * @param k
     * @return
     */
    public static int findTheWinner1(int n, int k) {
        int pos = 0;
        for (int i = 2; i <= n; i++) {
            pos = (0 + k) % i;
        }
        return pos;
    }

    /**
     * 直接遍历找最后剩下的数
     * 
     * @param n
     * @param k
     * @return
     */
    public static int findTheWinner2(int n, int k) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = ((idx + k - 1) % n);
            numbers.remove(idx);
            n--;
        }
        return numbers.get(0);
    }

    /**
     * 递归
     * 
     * @param n
     * @param k
     * @return
     */
    public static int findTheWinner3(int n, int k) {
        return findLast(n, k) + 1;
    }

    private static int findLast(int level, int posLen) {
        if (level == 1) {
            return 0;
        }
        int idx = (findLast(level - 1, posLen) + posLen) % level;
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner3(6, 5));
    }
}
