import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main_2258 {
    public static void main(String[] args) {

        String dosyaAdi = "C:\\Users\\Casper\\OneDrive\\Masaüstü\\Belgeler\\Yazılım Mühendisliği 2. Sınıf\\OOP\\6.Hafta\\Urunler.txt";
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
                        Urun_2258.beverages2258List.add((Beverages_2258) beverages);
                    }
                    if(kategoriIndex==2){
                        Urun_2258 condiments= new Condiments_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        Urun_2258.condiments2258List.add((Condiments_2258)condiments);
                    }
                    if(kategoriIndex==3){
                        Urun_2258 confections= new Confections_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        Urun_2258.confections2258List.add((Confections_2258) confections);
                    }
                    if(kategoriIndex==4){
                        Urun_2258 dairyProducts= new DairyProducts_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        Urun_2258.dairyProducts2258List.add((DairyProducts_2258) dairyProducts);
                    }
                    if(kategoriIndex==5){
                        Urun_2258 cereals= new Cereals_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        Urun_2258.cereals2258List.add((Cereals_2258)cereals);
                    }

                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Urun_2258.allProducts.addAll(Urun_2258.beverages2258List);
        Urun_2258.allProducts.addAll(Urun_2258.cereals2258List);
        Urun_2258.allProducts.addAll(Urun_2258.condiments2258List);
        Urun_2258.allProducts.addAll(Urun_2258.confections2258List);
        Urun_2258.allProducts.addAll(Urun_2258.dairyProducts2258List);
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
                    Urun_2258.UrunFiyatGuncelle(100);
                    Urun_2258.UrunFiyatGuncelle(50,25);
                    break;
                case 2:
                    Urun_2258.UrunKategorikZamYap("Beverages");
                    break;
                case 3:
                    Beverages_2258.UrunFiyatGuncelle(50);

                    break;
                case 4:
                    Condiments_2258.CesniBirimAgirlikGuncelle("15",10);
                    Condiments_2258.CesniBirimAgirlikGuncelle("20");

                    break;
                case 5:
                    Confections_2258.UrunStokGuncelle(10,true);
                    break;
                case 6:
               DairyProducts_2258.SutUrunuSil(25.2);
               DairyProducts_2258.SutUrunuSil();
               DairyProducts_2258.SutUrunuSil(10,30,45.1);
                    break;
                case 7:
                   Cereals_2258.TahilUrunEkle("ekmek","200gr",9.0,"detay");
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