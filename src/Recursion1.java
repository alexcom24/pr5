public class Recursion1 {
    int n1=0;
    void r1(int k, int n, int i) { // i в начале = 1
        if (i>k) {
            System.out.println("Дальше невозможно выводить числа");
            n1=0;
            return;
        }
        for (int j=1; j<=i;j++)
            if (n1<n) {
                System.out.println(i);
                n1=n1+1;
            }
        else {
            n1=0;
            return;
            }
        i=i+1;
        r1(k,n,i);
    }
}
