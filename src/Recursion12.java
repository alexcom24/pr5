import java.util.Scanner;
    public class Recursion12 {
       private int[] m = new int[1000];
        private int k = 0;
Recursion12 () {
    for (int i=0;i<1000;i++) {
        m[i]=0;
    }
}
       public int r12() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:");
            int a = sc.nextInt();
            if (a == 0) {
                k=0;
                if (m[k]==0) System.out.print("Кол-во нечётных чисел в последовательности: ");
                return m[k];
            }
            if (a % 2 != 0) {
                m[k] = a;
                k =k+ 1;
            }
            System.out.println(r12());
           if (m[k + 1]==0) {
               k=0;
               for (int i=0;i<1000;i++) {
                   m[i]=0;
               }
               System.exit(0);
           }
           k=k+1;
            return m[k];
        }


    }
