package niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class HJ5 {

    private Map<Character,Integer> map = new HashMap<>();

    public HJ5(){
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
    }
     
    public int changeHexToDecimalism(String hex){
        int sign = 16;
        int pos = 0;
        int sum = 0;
        hex = hex.replaceAll("0x", "");
        char[] cs = hex.toCharArray();
        pos = cs.length - 1;
        for(char c : cs){
            sum += Math.pow(sign, pos--) * this.map.get(c);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String word = in.nextLine();


        // int sum = new HJ5().changeHexToDecimalism(word);
        // System.out.println(sum);

        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
    }
}
