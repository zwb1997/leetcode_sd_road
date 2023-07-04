package niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ6 {

    public static void solution_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while((str = br.readLine()) != null){
            int num = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder();
            for(int i = 2; i <= Math.sqrt(num);i++){
                if(num % i == 0){
                    sb.append(i).append(" ");
                    num = num / i;
                    i--;
                }
            }
            sb.append(num).append(" ");
            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws IOException {
        solution_1();
    }
}
