package niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class HJ5 {

    public static void solution_1(){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String hex = in.nextLine();
            int dig = 0;
            hex = hex.replaceAll("0x","");
            hex = hex.replaceAll("0X","");
            int res = 0;
            char[] chars = hex.toCharArray();
            int len = chars.length;
            for(int i = len - 1; i >= 0; i--){
                int curIntVal;
                if(chars[i] > 57){
                    curIntVal = chars[i] - '7';
                }else{
                    curIntVal = chars[i] - '0';
                }
                res += (int)Math.pow(16,dig) * curIntVal;
                dig+=1;
            }
            System.out.println(res);
        }
    }

    public static void main(String[] args) {

//        solution_1();
        int val = Integer.parseInt("AA",16);
        System.out.println(val);
        double d = Double.parseDouble("0x1.8p1d");
        double d2 = 0x1.8p1D;
        System.out.println(d);
        System.out.println(d2);
    }
}
