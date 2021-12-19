public class Recursion4 {
    public static int r4(int l, int sum, int k, int s) {
        if (l == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c;
        if (l==0){
            c = 1;
        }
        else{
            c = 0;
        }
        int res = 0;
        for (int i = c; i < 10; i++) {
            res = res+r4(l + 1, sum + i, k, s);
        }
        return res;
    }
}
