public class Recursion2 {
    public int r2(int n) {
        if (n==1) {
            return 1;
        }
        n--;
        System.out.println(r2(n));
        return n+1;
    }
}
