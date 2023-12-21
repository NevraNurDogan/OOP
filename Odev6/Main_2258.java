import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2258 {
    public static void main(String[] args) {
        String dosyaAdi = "C:\\Users\\Casper\\OneDrive\\Masaüstü\\Belgeler\\Yazılım Mühendisliği 2. Sınıf\\OOP\\6.Hafta\\Urunler.txt";
        List<Beverages_2258> beverages2258List = new ArrayList<>();
        List<Cereals_2258> cereals2258List = new ArrayList<>();
        List<Condiments_2258> condiments2258List = new ArrayList<>();
        List<Confections_2258> confections2258List = new ArrayList<>();
        List<DairyProducts_2258> dairyProducts2258List = new ArrayList<>();
        List<Urun_2258> allProducts = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaAdi));
            String satir;

            while ((satir = bufferedReader.readLine()) != null) {
                String[] veri = satir.split("\t");
                if (veri.length == 5) {
                    String ad = veri[0];
                    int kategoriIndex = Integer.parseInt(veri[1]);
                    String birimAgirligi = veri[2];
                    double birimFiyat = Double.parseDouble(veri[3]);
                    int stokMiktari = Integer.parseInt(veri[4]);
                    if(kategoriIndex==1){
                        Urun_2258 beverages= new Beverages_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        beverages2258List.add((Beverages_2258) beverages);
                    }
                    if(kategoriIndex==2){
                        Urun_2258 condiments= new Condiments_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        condiments2258List.add((Condiments_2258)condiments);
                    }
                    if(kategoriIndex==3){
                        Urun_2258 confections= new Confections_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        confections2258List.add((Confections_2258) confections);
                    }
                    if(kategoriIndex==4){
                        Urun_2258 dairyProducts= new DairyProducts_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        dairyProducts2258List.add((DairyProducts_2258) dairyProducts);
                    }
                    if(kategoriIndex==5){
                        Urun_2258 cereals= new Cereals_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        cereals2258List.add((Cereals_2258)cereals);
                    }

                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            System.out.println("1: UrunFiyatGuncelle");
            System.out.println("2: UrunKategorikZamYap");
            System.out.println("3: UrunFiyatGuncelle (Beverages )");
            System.out.println("4: CesniBirimAgirlikGuncelle");
            System.out.println("5: UrunStokGuncelle (Confections)");
            System.out.println("6: SutUrunuSil");
            System.out.println("7: TahilUrunEkle");
            System.out.println("8: Çıkış");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen bir seçenek girin: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Miktar giriniz:");
                    int miktar= scanner.nextInt();
                    System.out.println("Güncel fiyat giriniz:");
                    int fiyat= scanner.nextInt();
                 //   Urun_2258.StokMiktarinaGoreUrunFiyatlariGuncelle(beverages2258List,miktar,fiyat);
                    for (Beverages_2258 b : beverages2258List) {
                        System.out.print( b.adi+"\t");
                        System.out.print( b.KategoriIndex+"\t");
                        System.out.print(b.BirimAgirligi+"\t");
                        System.out.print(b.BirimFiyati+"\t");
                        System.out.print(b.StokMiktari+"\t");
                        System.out.println();
                    }
                    break;
                case 2:
                    allProducts.addAll(beverages2258List);
                    allProducts.addAll(cereals2258List);
                    allProducts.addAll(condiments2258List);
                    allProducts.addAll(confections2258List);
                    allProducts.addAll(dairyProducts2258List);
                    System.out.println("Yapılacak zam miktarını giriniz:");
                    int zam= scanner.nextInt();
                    Urun_2258.UrunFiyatGuncelle(zam,allProducts);
                    break;
                case 3:
                    System.out.println("Miktar giriniz:");
                    int x= scanner.nextInt();
                    Beverages_2258.IcecekStoklariniGuncelle(x);
                    for (Beverages_2258 b : beverages2258List) {
                        System.out.print(b.adi + "\t");
                        System.out.print(b.KategoriIndex + "\t");
                        System.out.print(b.BirimAgirligi + "\t");
                        System.out.print(b.BirimFiyati + "\t");
                        System.out.print(b.StokMiktari + "\t");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("N degerini giriniz:");
                    int N= scanner.nextInt();
                    System.out.println("Yeni ağırlık giriniz:");
                    String agirlik= scanner.next();
                    Condiments_2258.CesniBirimAgirlikGuncelle(condiments2258List,N,agirlik);
                    for (Condiments_2258 b : condiments2258List) {
                        System.out.print( b.adi+"\t");
                        System.out.print( b.KategoriIndex+"\t");
                        System.out.print(b.BirimAgirligi+"\t");
                        System.out.print(b.BirimFiyati+"\t");
                        System.out.print(b.StokMiktari+"\t");
                        System.out.println();
                    }
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("min degerini giriniz:");
                    int min= scanner.nextInt();
                    System.out.println("max degerini giriniz:");
                    int max= scanner.nextInt();
                    DairyProducts_2258.SutUrunleriniSil(min,max, dairyProducts2258List);
                    break;
                case 7:
                    Cereals_2258.TahilUrunEkle("ekmek","200gr",9.0,35, cereals2258List);
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