public class Recursion15 {
   // int k=1;
    public int r15(int n) {
        if (n<10) {
            return n;
        }
        System.out.println(n%10);
        return r15(n/10);
    }
}
