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
    private static List<Paket2.Urun_2258> allProducts;

    public static void main(String[] args) {

        Oku_2258.main();
        beveragesList = Oku_2258.getBeveragesList();
        cerealsList = Oku_2258.getCerealsList();
        condimentsList = Oku_2258.getCondimentsList();
        confectionsList =Oku_2258.getConfectionsList();
        dairyProductsList =Oku_2258.getDairyProductsList();
        allProducts = Oku_2258.tumUrunleriGetir();

        while (true) {
            System.out.println("1: UrunleriFiyataGoreSil");
            System.out.println("2: UrunKategorikStokGuncelle");
            System.out.println("3: IcecekBirimAgirlikGuncelle");
            System.out.println("4: CesniStokGuncelle");
            System.out.println("5: SekerlemeUrunEkle");
            System.out.println("6: SutUrunleriDetayEkle");
            System.out.println("7: HububatSil");
            System.out.println("8: Çıkış");


            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen bir seçenek girin: ");
            int secim = scanner.nextInt();


            switch (secim) {
                case 1:
                    System.out.println("Min değerini giriniz:");
                    double min= scanner.nextInt();
                    System.out.println("Max değerini giriniz:");
                    double max= scanner.nextInt();
                    Paket2.Urun_2258.UrunleriFiyataGoreSil(allProducts,min,max);
                    for (Paket2.Urun_2258 b : allProducts) {
                        System.out.print( b.getAdi() +"\t");
                        System.out.print( b.getKategoriIndex() +"\t");
                        System.out.print(b.getBirimAgirligi() +"\t");
                        System.out.print(b.getBirimFiyati() +"\t");
                        System.out.print(b.getStokMiktari() +"\t");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Kategori giriniz:");
                    String Kategori= scanner.next();
                    System.out.println("Yüzde giriniz:");
                    int x= scanner.nextInt();
                    Paket2.Urun_2258.UrunKategorikStokGuncelle(Kategori,x,beveragesList,cerealsList,condimentsList,confectionsList,dairyProductsList);
                    break;
                case 3:
                   Beverages_2258.IcecekBirimAgirlikGuncelle("15");
                    break;
                case 4:
                    Condiments_2258.CesniStokGuncelle(condimentsList,true,2,8);
                    break;
                case 5:
                    Confections_2258.SekerlemeUrunEkle(confectionsList,"Elma Şekeri","100 gram",5.1,13);
                    break;
                case 6:
                    DairyProducts_2258.SutUrunleriDetayEkle(dairyProductsList,"yeni detay");
                    break;
                case 7:
                    System.out.println("Silinecek ürünü giriniz:");
                    String urun= scanner.next();
                    Cereals_2258.HububatSil( cerealsList,urun);
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