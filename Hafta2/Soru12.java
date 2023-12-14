import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Soru12 {
    // 10 adet ismi büyükten küçüğe sıralayınız. Sıralama işleminden sonra yeni gelen string ifadeyi sırayı
    //bozmayacak şekilde ekleyiniz.  Örnek: Zeynel, Osman, Kemal, Ali vb… Veli geldi.    .  Zeynel, Veli, Osman, Kemal, Ali

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> isimListesi = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                System.out.print("Bir isim girin: ");
                String isim = scanner.nextLine();
                isimListesi.add(isim);
            }
            Collections.sort(isimListesi, Collections.reverseOrder());

            System.out.print("Yeni bir isim girin: ");
            String yeniIsim = scanner.nextLine();

            int index = Collections.binarySearch(isimListesi, yeniIsim, Collections.reverseOrder());
            if (index < 0) {
                index = -index - 1;
            }
            isimListesi.add(index, yeniIsim);

            System.out.println("Sıralı İsim Listesi:");
            for (String isim : isimListesi) {
                System.out.println(isim);
            }
        }
    }


