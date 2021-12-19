import java.util.Scanner;
public class Recursion16 {
    private int[] m = new int[1000];
    private int k = 0;
    private int max=0;
    private int k1 = 0;
    Recursion16 () {
        for (int i=0;i<1000;i++) {
            m[i]=0;
        }
    }
    public int r16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        if (a == 0) {
            k=0;
            return k1;
        }
        m[k]=a;
        if (m[k]>max) max=m[k];
        k =k+ 1;
        r16();
        if ((m[k]==max)&&(m[k]!=0)) k1=k1+1;
        k=k+1;
        return k1;
    }


}