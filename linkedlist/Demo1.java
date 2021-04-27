package linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        System.out.println(list.indexOf(null));
    }
}
