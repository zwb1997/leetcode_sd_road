import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCode781 {
    // 自己过了的代码
    public static int numRabbits(int[] answers) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>(10);
        for (int i : answers) {
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }
        int sum = 0;
        Set<Map.Entry<Integer, Integer>> theEntity = numMap.entrySet();
        int theRest = 0;
        int theVal = 0;
        int theTimes = 0;
        int restGroups = 0;
        int val = 0;
        for (Map.Entry<Integer, Integer> entry : theEntity) {
            theVal = entry.getKey();
            theTimes = entry.getValue();
            if (theVal == 0) {
                continue;
            }
            restGroups = theTimes % (theVal + 1);
            if (restGroups == 0) {
                val = theTimes / (theVal + 1);
                sum += val * (theVal + 1);
            } else {
                if (theTimes < theVal + 1) {
                    sum += theVal + 1;
                } else {
                    theRest = (theVal + 1) - theTimes % (theVal + 1);
                    sum += theRest + theTimes;
                }
            }

        }

        return sum + numMap.getOrDefault(0, 0);
    }

    // 国外大神
    public static int numRabbits1(int[] arr) {
        int answer[] = new int[1000 + 1];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (answer[val] == 0) {
                ans += (val + 1);
                answer[val] = 1;
            } else {
                answer[val] += 1;
            }
            if (answer[val] == val + 1) {
                answer[val] = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2 };// 3
        int[] arr2 = { 0, 0, 1, 1, 1 };// 6
        int[] arr3 = { 10, 10, 10 };// 11
        int[] arr4 = { 2, 1, 2, 2, 2, 2, 2, 2, 1, 1 };// 13
        int[] arr5 = { 0, 1, 0, 2, 0, 1, 0, 2, 1, 1 };// 11
        int[] arr6 = { 1, 0, 1, 0, 0 };// 5
        int[] arr7 = { 0, 3, 2, 0, 3, 3, 4, 2, 4, 3, 2, 4, 4, 3, 0, 1, 3, 4, 4, 3 };
        System.out.println(numRabbits1(arr7));
    }
}
