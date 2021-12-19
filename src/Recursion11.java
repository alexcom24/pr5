import java.util.Scanner;
public class Recursion11 {
    private int k0=0;
    public int r11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        if ((k0==0) && (a==0)) {
            k0=k0+1;
            return r11();
        }
        if ((k0==1) && (a==0))
            return 0;
        k0=0;
        if (a==1) return r11()+1;
        return r11();
    }
}
