public class Recursion3 {
    public int r3(int a,int b) {
        if (a<b) {
            if (b==a) {
                return a;
            }
            b--;
            System.out.println(r3(a,b));
            return b+1;
        }
        else {
            if (b==a) {
                return a;
            }
            b++;
            System.out.println(r3(a,b));
            return b-1;
        }
        }
    }

