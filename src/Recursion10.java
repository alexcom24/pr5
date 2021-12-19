public class Recursion10 {
    int k=1;
    public int r10(int n) {
        if (n<10) {
            k=1;
            return n;
        }
        return r10(n/10)+(n%10)*(k=k*10);
    }
}
