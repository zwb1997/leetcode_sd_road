package niuke;

import java.util.Scanner;

public class HJ1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] lines = line.split(" ");
        System.out.println(lines[lines.length - 1].length());
    }
}
