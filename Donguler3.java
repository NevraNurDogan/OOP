import java.util.Scanner;
public class Donguler3 {
    /*3. Bir sayı serisi için serinin ilk elemanı, eleman sayısı ve artış miktarına göre serinin sonucunu hesaplayınız.*/
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Seriye başlayacak ilk elemanı girin: ");
            int ilkEleman = scanner.nextInt();

            System.out.print("Toplam eleman sayısını girin: ");
            int elemanSayisi = scanner.nextInt();

            System.out.print("Artış miktarını girin: ");
            int artisMiktari = scanner.nextInt();

            int seriToplami = hesaplaSeriToplami(ilkEleman, elemanSayisi, artisMiktari);

            System.out.println("Seri Toplamı: " + seriToplami);

        }

        public static int hesaplaSeriToplami(int ilkEleman, int elemanSayisi, int artisMiktari) {
            int seriToplami = 0;
            int eleman = ilkEleman;

            for (int i = 0; i < elemanSayisi; i++) {
                seriToplami += eleman;
                eleman += artisMiktari;
            }
            return seriToplami;
        }

    }


