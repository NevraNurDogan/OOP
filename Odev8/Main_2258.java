package Odev8;

import java.util.Scanner;

import Odev8.Urun_2258.Beverages;
import Odev8.Urun_2258.Cereals;
import Odev8.Urun_2258.Condiments;
import Odev8.Urun_2258.Confections;
import Odev8.Urun_2258.DairyProducts;
public class Main_2258 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        DosyaIslemleri_2258.DosyaOkuma.ListeOlustur();

        while (true) {
            System.out.println();
            System.out.println("1. UrunStokGuncelle" );
            System.out.println("2. UrunKategorikIndirimYap");
            System.out.println("3. IcecekUrunuSil");
            System.out.println("4. CesniUrunEkle");
            System.out.println("5. SekerlemeDetayEkle");
            System.out.println("6. SutUrunuStokGuncelle");
            System.out.println("7. TahilBirimAgirlikGuncelle");
            System.out.println("8. DosyayaYaz");
            System.out.println("0. Çıkış");

            System.out.print("Seçim: ");
            int secim = scanner.nextInt();

            System.out.println();

            switch (secim) {
                case 1:
                    System.out.println("Stok güncellemesi yapacağınız listeyi girin:");
                    System.out.println("1) Beverages");
                    System.out.println("2) Condiments");
                    System.out.println("3) Confections");
                    System.out.println("4) DairyProducts");
                    System.out.println("5) Cereals");
                    int liste=scanner.nextInt();
                   Urun_2258.UrunStokGuncelle(liste,true);
                    break;
                case 2:
                    System.out.println("Stok güncellemesi yapacağınız listeyi girin:");
                    System.out.println("1) Beverages");
                    System.out.println("2) Condiments");
                    System.out.println("3) Confections");
                    System.out.println("4) DairyProducts");
                    System.out.println("5) Cereals");
                    int a=scanner.nextInt();
                    System.out.println("Yüzde kaç indirim yapmak istersiniz?");
                    int x=scanner.nextInt();
                    Urun_2258.UrunKategorikIndirimYap(a, x);
                    break;
                case 3:
                    System.out.println("Silinecek içecek ürününü giriniz:");
                    Scanner scanner=new Scanner(System.in);
                    String b=scanner.nextLine();
                    Beverages.IcecekUrunuSil(b);
                    break;
                case 4:
                    Condiments.CesniUrunEkle("Sebze çeşnisi", "750 gr", 80, 145);
                    break;
                case 5:
                    Confections.SekerlemeDetayEkle("Yeni detay");
                    break;
                case 6:
                    DairyProducts.SutUrunuStokGuncelle(false, 50);
                    break;
                case 7:
                    Cereals.TahilBirimFiyatGuncelle(15.9);
                    break;

                case 8:
                    System.out.println("Dosyaya yazıldı.");
                    DosyaIslemleri_2258.DosyaYazma.ListeyiYaz();
                    break;

                default:
                    System.out.println("Geçersiz işlem.");
                    break;
            }
        }
    }
}
