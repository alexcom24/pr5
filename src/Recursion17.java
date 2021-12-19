import java.util.Scanner;
public class Recursion17 {

    public int r17() {
        int max=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        if (a>max) max=a;
        return r17(max);
    }
    public int r17(int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        if (a == 0) {
            return max;
        }
        if (a>max) max=a;
        return r17(max);
    }

}
