import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Soru8 {
    //8. 10 adet double sayıyı listeye ekleyiniz. Sayıları sıraladıktan sonra yeni gelen sayıyı sırayı bozmayacak
    //şekilde ekleyiniz
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Double> sayiListesi = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                System.out.print("Bir double sayı girin: ");
                double sayi = scanner.nextDouble();
                sayiListesi.add(sayi);
            }
            Collections.sort(sayiListesi);
            System.out.print("Yeni bir double sayı girin: ");
            double yeniSayi = scanner.nextDouble();

            int index = Collections.binarySearch(sayiListesi, yeniSayi);
            if (index < 0) {
                index = -index - 1;
            }
            sayiListesi.add(index, yeniSayi);
            System.out.println("Sıralı Liste:");
            for (double sayi : sayiListesi) {
                System.out.println(sayi);
            }

        }
    }


