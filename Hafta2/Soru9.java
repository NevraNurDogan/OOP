import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Soru9 {
    //9. 10 tane isim giriniz. Oluşturduğunuz listede ‘a’ ile başlayıp “c” ile biten isimleri listeleyiniz.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> isimListesi = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                System.out.print("Bir isim girin: ");
                String isim = scanner.nextLine();
                isimListesi.add(isim);
            }

            System.out.println("'a' ile başlayan ve 'c' ile biten isimler:");
            for (String isim : isimListesi) {
                if (isim.toLowerCase().startsWith("a") && isim.toLowerCase().endsWith("c")) {
                    System.out.println(isim);
                }
            }
        }
    }

