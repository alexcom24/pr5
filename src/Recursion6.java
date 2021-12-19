public class Recursion6 {
    private int i=2;
    public int r6(int n) {
        if (n == 2)
            return 0;
        else if ((n % i == 0)&&(n!=i))
            return -1;
        else if (i < n / 2) { // граница поиска, её пересечение бессмысленно, т.к. умножив на "два" и более превысим изначальное число
            i=i+1;
            return r6(n);
        }
         else
            return 0;
    }
}
