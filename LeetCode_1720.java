public class LeetCode_1720 {
    public static int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] res = new int[len + 1];
        res[0] = first;
        for(int i = 1 ; i < len; i++){
            res[i] = encoded[i-1] ^ res[i-1] ;
        }
        res[len] = res[len-1] ^ encoded[len-1];
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int first = 1;
        for(int x : decode(arr, first)){
            System.out.print(x + "\t");
        }
    }
}
