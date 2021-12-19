public class Recursion14 {
    public int r14(int n) {
        if (n<10) {
            return n;
        }
        System.out.println(r14(n/10));
        return n%10;
    }
}
