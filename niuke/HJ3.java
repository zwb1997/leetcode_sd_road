package niuke;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class HJ3 {

    public static void solution_1() {
        Scanner in = new Scanner(System.in);
        int cout = in.nextInt();
        int i = 0;
        Set<Integer> sets = new HashSet<>(cout);
        for (; i < cout; i++) {
            int curNum = in.nextInt();
            sets.add(curNum);
        }

        List<Integer> afterSort = sets.stream().sorted().collect(Collectors.toList());
        for (int j : afterSort) {
            System.out.println(j);
        }
    }

    public static void solution_2() {
        Scanner in = new Scanner(System.in);
        int cout = in.nextInt();
        int[] arr = new int[1001];
        while (cout-- > 0) {
            int curNum = in.nextInt();
            arr[curNum] = 1;
        }
        for (int i = 0; i < arr.length; i++)
            if(arr[i] == 1){
                System.out.println(i);
            }
    }

    public static void main(String[] args) {
//        solution_1();
        solution_2();
    }
}
