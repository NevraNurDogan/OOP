import java.util.Scanner;
public class Donguler9 {
    /*9. 6174 Sayısı: Kaprekar sabiti olarak da bilinen sayının özelliği, aşağıdaki adımları takip ettiğimizde en
fazla 7 adımda 6174 sayısını elde etmemizdir. Kaprekar sabitini bulan fonksiyonu yazınız. Fonksiyonu 4
basamaklı sayılarla test ediniz.
1. Tüm rakamları aynı olmayan (4444 gibi) herhangi bir dört basamaklı sayı alınır.
2. Sayının rakamları büyükten küçüğe ve küçükten büyüğe sıralanarak iki yeni dört basamaklı sayı elde
edilir.
3. Büyük sayıdan küçük sayı çıkarılır.
4. Bulunan sayı bir önceki sayıya eşit değilse işlem 2. adımdan itibaren bu yeni sayı ile tekrarlanır.
5. Sonuç olarak 6174 sayısı bulunur.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dört basamaklı bir sayı girin: ");
        int baslangicSayisi = scanner.nextInt();
        scanner.close();

        if (baslangicSayisi < 1000 || baslangicSayisi >= 10000) {
            System.out.println("Geçersiz giriş. Dört basamaklı bir sayı girin.");
        } else {
            int kaprekarSabiti = kaprekarSabitiBul(baslangicSayisi);
            System.out.println("Kaprekar Sabiti: " + kaprekarSabiti);
        }
    }


    public static int kaprekarSabitiBul(int sayi) {
        if (sayi < 1000 || sayi >= 10000) {
            throw new IllegalArgumentException("Dört basamaklı bir sayı girmelisiniz.");
        }

        int kaprekarSabiti = 6174;

        while (sayi != kaprekarSabiti && sayi != 0) {
            int buyuk = enBuyukBasamaklariAl(sayi);
            int kucuk = enKucukBasamaklariAl(sayi);

            sayi = buyuk - kucuk;
            System.out.println(buyuk + " - " + kucuk + " = " + sayi);
        }

        return kaprekarSabiti;
    }

    private static int enBuyukBasamaklariAl(int sayi) {
        int[] basamaklar = new int[4];
        for (int i = 0; i < 4; i++) {
            basamaklar[i] = sayi % 10;
            sayi /= 10;
        }

        int buyuk = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (basamaklar[i] < basamaklar[j]) {
                    int temp = basamaklar[i];
                    basamaklar[i] = basamaklar[j];
                    basamaklar[j] = temp;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            buyuk = buyuk * 10 + basamaklar[i];
        }

        return buyuk;
    }

    private static int enKucukBasamaklariAl(int sayi) {
        int[] basamaklar = new int[4];
        for (int i = 0; i < 4; i++) {
            basamaklar[i] = sayi % 10;
            sayi /= 10;
        }

        int kucuk = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (basamaklar[i] > basamaklar[j]) {
                    int temp = basamaklar[i];
                    basamaklar[i] = basamaklar[j];
                    basamaklar[j] = temp;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            kucuk = kucuk * 10 + basamaklar[i];
        }

        return kucuk;
    }

}
