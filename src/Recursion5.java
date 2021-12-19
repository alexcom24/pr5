public class Recursion5 {
    public int r5(int N) {
        if (N<10) return N;
        return r5(N/10)+(N % 10);
    }
}
