public class Recursion7 {
    private int i=2;
    public void r7(int n) {

         if (i > n / 2) { // граница поиска, её пересечение бессмысленно
            System.out.println(n); // сюда дойдём, если n - простое число
            return;
        }
        else if (n%i==0) {
             System.out.println(i);
             r7(n/i);
         }
        else if (n%i!=0) {
            i++;
            r7(n);
         }
    }
}

