package exercises;
public class LeetCode_633 {
    
    public static boolean judgeSquareSum(int c) {
        for(int i = 1;i<=c;i++){
            for(int j = 1; j<= c;j++){
                if((i*i + j*j )== c){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(4));
    }
}
