package niuke;

import java.util.Scanner;

public class HJ4 {

    public static void solution_1() {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String cur = in.nextLine();
            if(cur.length() % 8 != 0){
                cur += "00000000";
            }
            while(cur.length() >= 8){
                System.out.println(cur.substring(0,8));
                cur = cur.substring(8);
            }
        }
    }

    public static void main(String[] args) {
        solution_1();
//        System.out.println(3 % 8);
    }
}
