import java.util.Scanner;
    public class Recursion13 {
        private int[] m = new int[1000];
        private int k = 1;
        Recursion13 () {
            for (int i=0;i<1000;i++) {
                m[i]=0;
            }
        }
        public int r13() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:");
            int a = sc.nextInt();
            if (a == 0) {
                k=1;
                if (m[k]==0) System.out.print("Кол-во чисел на нечётных номерах в последовательности, не считая нуля: 0");
                return m[k];
            }
            if (k % 2 != 0) {
                m[k] = a;
            }
            k =k+ 1;
            System.out.println(r13());
            if (m[k+2]==0) {
                k=1;
                for (int i=0;i<1000;i++) {
                    m[i]=0;
                }
                System.exit(0);
            }
            k=k+2;
            return m[k];
        }


    }

