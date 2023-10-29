import java.util.Scanner;
public class Soru2 {
    //2. Bir poligonun alanını (en az 4 kenar giriniz) aşağıdaki formüle göre hesaplayınız. n değeri poligonun
    //kenar sayısıdır.
    //alan =alan+ (xn+1 - xn) * (yn+1  + yn) / 2
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Poligonun kenar sayısını girin (en az 4):");
        int n = scanner.nextInt();
        if (n < 4) {
            System.out.println("En az 4 kenar girilmelidir.");
            scanner.close();
            return;
        }
        double alan = 0.0;
        double[] x = new double[n];
        double[] y = new double[n];

        System.out.println("Poligonun kenarlarının koordinatlarını sırayla girin:");

        for (int i = 0; i < n; i++) {
            System.out.print("x" + (i + 1) + ": ");
            x[i] = scanner.nextDouble();
            System.out.print("y" + (i + 1) + ": ");
            y[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n - 1; i++) {
            alan += (x[i + 1] - x[i]) * (y[i + 1] + y[i]) / 2.0;
        }
        alan += (x[0] - x[n - 1]) * (y[0] + y[n - 1]) / 2.0;
        alan = Math.abs(alan);
        System.out.println("Poligonun Alanı: " + alan);

    }
}
