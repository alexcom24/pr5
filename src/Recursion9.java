public class Recursion9 {
    public int r9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return r9(a, b - 1) + r9(a - 1, b - 1); // комбинаторная формула
    }
}
