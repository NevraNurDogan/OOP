package Paket2;
import Paket1.Oku_2258;
import java.util.List;
import java.util.Scanner;

public class Main_2258 {
    private static List<Beverages_2258> beveragesList;
    private static List<Cereals_2258> cerealsList;
    private static List<Condiments_2258> condimentsList;
    private static List<Confections_2258> confectionsList;
    private static List<DairyProducts_2258> dairyProductsList;
    private static List<Urun_2258> allProducts;

    public static void main(String[] args) {

        Oku_2258.main();
         beveragesList = Oku_2258.getBeveragesList();
         cerealsList = Oku_2258.getCerealsList();
         condimentsList = Oku_2258.getCondimentsList();
         confectionsList =Oku_2258.getConfectionsList();
         dairyProductsList =Oku_2258.getDairyProductsList();
         allProducts = Oku_2258.tumUrunleriGetir();

        while (true) {
            System.out.println("1: UrunStokGuncelle");
            System.out.println("2: UrunAdiDegistir");
            System.out.println("3: IcecekUrunuEkle");
            System.out.println("4: CesniBirimFiyatGuncelle");
            System.out.println("5: SekerlemeDetaySil");
            System.out.println("6: SutUrunuSil");
            System.out.println("7: TahılMinStokEkle");
            System.out.println("8: Çıkış");


            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen bir seçenek girin: ");
            int secim = scanner.nextInt();


            switch (secim) {
                case 1:
                    System.out.println("Stok güncellemesi yapmak istediğiniz ürünü giriniz:");
                    String UrunAdi= scanner.next();
                    System.out.println("Adet giriniz:");
                    int adet= scanner.nextInt();
                    Urun_2258.UrunStokGuncelle(allProducts,UrunAdi,true,adet);
                    for (Urun_2258 b : allProducts) {
                        System.out.print( b.getAdi() +"\t");
                        System.out.print( b.getKategoriIndex() +"\t");
                        System.out.print(b.getBirimAgirligi() +"\t");
                        System.out.print(b.getBirimFiyati() +"\t");
                        System.out.print(b.getStokMiktari() +"\t");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("İsim güncellemesi yapmak istediğiniz ürünü giriniz:");
                    String EskiUrunAdi= scanner.next();
                    System.out.println("Yeni ismi giriniz:");
                    String YeniUrunAdi= scanner.next();
                Urun_2258.UrunAdiDegistir(allProducts,EskiUrunAdi,YeniUrunAdi);
                    break;
                case 3:
                   Beverages_2258.IcecekUrunuEkle("Kahve",1,"200 ml",5.0,500,beveragesList);
                   break;
                case 4:
                    System.out.println("Birim fiyatını güncellemek istediğiniz çeşni ürününün ismini giriniz:");
                    String adi = scanner.next();
                    System.out.println("Yeni fiyat giriniz:");

                    if (scanner.hasNextDouble()) {
                        double fiyat = scanner.nextDouble();
                        Condiments_2258.CesniBirimFiyatGuncelle(condimentsList, adi, fiyat);
                    } else {
                        System.out.println("Hata: Beklenen türde bir değer girilmedi. Lütfen bir double değeri girin.");
                        scanner.next(); // Hatalı girişi tüket
                    }
                    break;

                case 5:
                    //sekerlemeDetayEkle  fonksiyonunu yazdım ama anlamadığım bir şekilde
                    // diğer fonksiyonları çağırabiliyorken IDE bu fonksiyonu çağırmadı :'(
                    break;
                case 6:
                   DairyProducts_2258.SutUrunuSil(dairyProductsList);
                    break;
                case 7:
                    System.out.println("Eklenecek stok miktarını giriniz:");
                    int miktar= scanner.nextInt();
                    Cereals_2258.TahılMinStokEkle( cerealsList,miktar);
                    break;
                case 8:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz bir seçenek girdiniz. Lütfen tekrar deneyin.");
            }
        }
    }
}