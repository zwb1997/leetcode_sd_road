package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListSd {

    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3, 4, 5 };
        List<Integer> lists = Arrays.asList(nums);
        // watchElement(lists);
        // try {
        //     lists.add(1);
        // } catch (Exception ex) {
        //     System.err.println("catch :" + (Objects.isNull(ex.getMessage()) ? ex : ex.getMessage()));
        // }
        // try {
        //     lists.remove(5);
        // } catch (Exception ex) {
        //     System.err.println("catch :" + (Objects.isNull(ex.getMessage()) ? ex : ex.getMessage()));
        // }
        // watchElement(lists);
        ListSd lSd = new ListSd();
        lSd.test1();
    }

    public static <T> void watchElement(List<T> list) {
        for (T t : list) {
            System.out.print(t.toString()+"\t");
        }
        System.out.println();
    }
    public void test1(){
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);

        watchElement(lists);

        lists.add(5);
        watchElement(lists);

        System.out.println(lists.remove(Integer.valueOf(1)));
        watchElement(lists);
    }
}
