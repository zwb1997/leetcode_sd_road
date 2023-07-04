package niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ2 {

    public static void solution_1(){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String target = in.nextLine();
        line = line.toLowerCase();
        target = target.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = line.toCharArray();
        char targetChar = target.toCharArray()[0];
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map.getOrDefault(targetChar,0));
    }
    public static void solution_2(){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String target = in.nextLine();

        int rtn = 0;
        for(int i = 0; i<line.length();i++){
            if(line.toLowerCase().charAt(i) == target.toLowerCase().charAt(0)){
                rtn++;
            }
        }
        System.out.println(rtn);
    }

    public static void main(String[] args) {
        solution_2();
    }
}
