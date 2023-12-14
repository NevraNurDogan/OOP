import java.util.Scanner;

    //3. (n-1)!  > 2n * nLogn ,  n>2 olmak üzere eşitsizliğini sağlayan en küçük n değerini bulunuz.
public class Soru3 {
    public static void main(String[] args) {
        int n = 3;
        while (true) {
            double solTaraf = faktoriyel(n - 1);
            double sagTaraf = (double) (Math.pow(2, n) * Math.pow(n, Math.log(n)));
            System.out.println(solTaraf+" > "+sagTaraf);
            if (solTaraf > sagTaraf) {
                System.out.println("En küçük n değeri: " + n);
                break;
            }
            n++;
        }
    }
    public static long faktoriyel(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktoriyel(n - 1);
        }
    }
}
