package exercise_review;

public class LT70 {

    public int climbStairs(int n) {
        int[] stairs;
        if( n < 3 ){
            stairs = new int[3];
        }else{
            stairs = new int[n + 1];
        }

        stairs[0] = 1;
        stairs[1] = 1;
        stairs[2] = 2;

        for(int i = 3; i <= n ; i++){
            stairs[i] = stairs[i - 2] + stairs[i - 1];
        }

        return stairs[n];
    }



    public static void main(String[] args) {
        
        LT70 lt70 = new LT70();
        System.out.println(lt70.climbStairs(10));
    }
}
