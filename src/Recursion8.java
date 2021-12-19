public class Recursion8 {
    static int i=-1; // повторно вызвать метод с одним и тем же объектом не получится, так как у i изначально будет уже другое значение, а не "-1"
   public int r8(String N) {
       i++;
       if (i==N.length()-i-1)
       {
           return 0;
       }
       if (Math.abs(i-(N.length()-i-1))==1)
       {
           if (N.charAt(i)==N.charAt(N.length()-i-1))
           return 1;
           else return 0;
       }
       if (N.charAt(i)==N.charAt(N.length()-i-1))
           return r8(N)+1;
       else return r8(N);
   }
}
