package exercises;
public class LeetCode_7 {
    
    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        int val = Math.abs(x);
        while(val > 0){
            sb.append(val % 10);
            val /= 10;
        }
        try{
            if(x < 0){
                sb.insert(0, "-");
            }
            return Integer.parseInt(sb.toString());
        }catch(Exception ex){
            return 0;
        }
    }

    public static int reverse1(int x) {
        int rev = 0;
        while(x != 0){
            if(rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10){
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
    public static void main(String[] args) {
        // System.out.println(reverse(-123));
        System.out.println(reverse1(123));
        System.out.println(Integer.MAX_VALUE % 10);
        // System.out.println(Integer.parseInt("-123"));
    }
}
