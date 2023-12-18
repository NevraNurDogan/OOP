
/*
package Paket2;

import Paket1.Oku_2258;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Paket2.Beverages_2258.beveragesList;
import static Paket2.Cereals_2258.cerealsList;
import static Paket2.Condiments_2258.condimentsList;
import static Paket2.Confections_2258.confectionsList;
import static Paket2.DairyProducts_2258.dairyProductsList;
import static Paket2.Urun_2258.allProducts;

public class TUMSINIFLAR_2258 {
    package Paket1;

import Paket2.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Paket2.Beverages_2258.beveragesList;
import static Paket2.Cereals_2258.cerealsList;
import static Paket2.Condiments_2258.condimentsList;
import static Paket2.Confections_2258.confectionsList;
import static Paket2.DairyProducts_2258.dairyProductsList;
import static Paket2.Urun_2258.allProducts;

    public class Oku_2258 {
        public static void main() {
            String dosyaAdi = "C:\\Users\\Casper\\OneDrive\\Masaüstü\\Belgeler\\Yazılım Mühendisliği 2. Sınıf\\OOP\\3.Hafta\\Urun.txt";
            List<Beverages_2258> beveragesList = new ArrayList<>();
            List<Cereals_2258> cerealsList = new ArrayList<>();
            List<Condiments_2258> condimentsList = new ArrayList<>();
            List<Confections_2258> confectionsList = new ArrayList<>();
            List<DairyProducts_2258> dairyProductsList = new ArrayList<>();
            List<Paket2.Urun_2258> allProducts = new ArrayList<>();
            dosyadanVeriOku(dosyaAdi, beveragesList, cerealsList, condimentsList, confectionsList, dairyProductsList);
            allProducts.addAll(beveragesList);
            allProducts.addAll(cerealsList);
            allProducts.addAll(condimentsList);
            allProducts.addAll(confectionsList);
            allProducts.addAll(dairyProductsList);
            yaz(allProducts);
        }
        protected static void dosyadanVeriOku(String dosyaAdi, List<Beverages_2258> beveragesList,
                                              List<Cereals_2258> cerealsList, List<Condiments_2258> condimentsList,
                                              List<Confections_2258> confectionsList, List<DairyProducts_2258> dairyProductsList) {

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaAdi))) {
                String satir;

                while ((satir = bufferedReader.readLine()) != null) {
                    String[] veri = satir.split("\t");
                    if (veri.length == 5) {
                        String ad = veri[0];
                        int kategoriIndex = Integer.parseInt(veri[1]);
                        String birimAgirligi = veri[2];
                        double birimFiyat = Double.parseDouble(veri[3]);
                        int stokMiktari = Integer.parseInt(veri[4]);

                        if (kategoriIndex == 1) {
                            Paket2.Urun_2258 beverages = new Beverages_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                            beveragesList.add((Beverages_2258) beverages);
                        } else if (kategoriIndex == 2) {
                            Paket2.Urun_2258 condiments = new Condiments_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                            condimentsList.add((Condiments_2258) condiments);
                        } else if (kategoriIndex == 3) {
                            Paket2.Urun_2258 confections = new Confections_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                            confectionsList.add((Confections_2258) confections);
                        } else if (kategoriIndex == 4) {
                            Paket2.Urun_2258 dairyProducts = new DairyProducts_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                            dairyProductsList.add((DairyProducts_2258) dairyProducts);
                        } else if (kategoriIndex == 5) {
                            Paket2.Urun_2258 cereals = new Cereals_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                            cerealsList.add((Cereals_2258) cereals);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Ürün listesi");
        }
        public static void yaz(List<Paket2.Urun_2258> allProducts){
            for (Paket2.Urun_2258 b :allProducts) {
                System.out.print( b.getAdi() +"\t");
                System.out.print( b.getKategoriIndex() +"\t");
                System.out.print(b.getBirimAgirligi() +"\t");
                System.out.print(b.getBirimFiyati() +"\t");
                System.out.print(b.getStokMiktari() +"\t");
                System.out.println();
            }
        }
        public static List<Paket2.Urun_2258> tumUrunleriGetir() {
            List<Paket2.Urun_2258> allProducts = new ArrayList<>();
            allProducts.addAll(beveragesList);
            allProducts.addAll(cerealsList);
            allProducts.addAll(condimentsList);
            allProducts.addAll(confectionsList);
            allProducts.addAll(dairyProductsList);
            return allProducts;
        }
        public static List<Beverages_2258> getBeveragesList() {
            return beveragesList;
        }

        public static List<Cereals_2258> getCerealsList() {
            return cerealsList;
        }

        public static List<Condiments_2258> getCondimentsList() {
            return condimentsList;
        }

        public static List<Confections_2258> getConfectionsList() {
            return confectionsList;
        }

        public static List<DairyProducts_2258> getDairyProductsList() {
            return dairyProductsList;
        }
        public static List<Paket2.Urun_2258> getAllProducts() {
            return allProducts;
        }

    }
package Paket2;

import java.util.ArrayList;
import java.util.List;

    public class Beverages_2258 extends Paket2.Urun_2258 {
        public static List<Paket2.Beverages_2258> beveragesList = new ArrayList<>();
        public Beverages_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
            beveragesList.add(this);
        }
        protected static void IcecekBirimAgirlikGuncelle(String yeniAgirlik) {
            int listSize = beveragesList.size();
            if (listSize > 0) {
                Paket2.Beverages_2258 lastBeverage = beveragesList.get(listSize - 1);
                lastBeverage.setBirimAgirligi(yeniAgirlik);
                System.out.println("Ağırlık güncellendi: " + lastBeverage.getAdi() + " - Yeni ağırlık: " + lastBeverage.getBirimAgirligi());
            } else {
                System.out.println("Liste boş.");
            }
            for (Paket2.Beverages_2258 b : beveragesList) {
                System.out.print( b.getAdi() +"\t");
                System.out.print( b.getKategoriIndex() +"\t");
                System.out.print(b.getBirimAgirligi() +"\t");
                System.out.print(b.getBirimFiyati() +"\t");
                System.out.print(b.getStokMiktari() +"\t");
                System.out.println();
            }
        }
    }
package Paket2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
    public class Cereals_2258 extends Paket2.Urun_2258 {
        public static List<Paket2.Cereals_2258> cerealsList = new ArrayList<>();
        public Cereals_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
            super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
            cerealsList.add(this);
        }
        protected static void HububatSil(List<Paket2.Cereals_2258> cerealsList, String urunAdi) {
            List<Paket2.Cereals_2258> silinecekler = new ArrayList<>();

            for (Paket2.Cereals_2258 tahilUrunu : cerealsList) {
                if (tahilUrunu.getAdi().equals(urunAdi)) {
                    silinecekler.add(tahilUrunu);
                }
            }

            for (Paket2.Cereals_2258 silinecek : silinecekler) {
                cerealsList.remove(silinecek);
            }

            for (Paket2.Cereals_2258 tahilUrunu : cerealsList) {
                System.out.println(tahilUrunu.getAdi() +
                        "\t" + tahilUrunu.getKategoriIndex() +
                        "\t" + tahilUrunu.getBirimAgirligi() +
                        "\t" + tahilUrunu.getBirimFiyati() +
                        "\t" + tahilUrunu.getStokMiktari());
            }
        }
    }
package Paket2;

import java.util.ArrayList;
import java.util.List;

    public class Condiments_2258 extends Paket2.Urun_2258 {
        public static List<Paket2.Condiments_2258> condimentsList = new ArrayList<>();
        public Condiments_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
            super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
            condimentsList.add(this);
        }
        protected static void CesniStokGuncelle(List<Paket2.Condiments_2258> condimentsList, boolean Satismi, int index, int miktar) {
            if (index >= 1 && index <= condimentsList.size()) {
                Paket2.Condiments_2258 cesni = condimentsList.get(index - 1);

                if (Satismi) {
                    if (cesni.getStokMiktari() >= miktar) {
                        cesni.setStokMiktari(cesni.getStokMiktari() - miktar);
                        System.out.println("Satış yapıldı. Yeni stok miktarı: " + cesni.getStokMiktari());
                    } else {
                        System.out.println("Yetersiz stok, satış yapılamadı.");
                    }
                } else {
                    cesni.setStokMiktari(cesni.getStokMiktari() + miktar);
                    System.out.println("Stok girişi yapıldı. Yeni stok miktarı: " + cesni.getStokMiktari());
                }
                for (Paket2.Condiments_2258 b : condimentsList) {
                    System.out.print(b.getAdi() + "\t");
                    System.out.print(b.getKategoriIndex() + "\t");
                    System.out.print(b.getBirimAgirligi() + "\t");
                    System.out.print(b.getBirimFiyati() + "\t");
                    System.out.print(b.getStokMiktari() + "\t");
                    System.out.println();
                }
            } else {
                System.out.println("Geçersiz index, çeşni bulunamadı.");
            }
        }
    }
package Paket2;

import java.util.ArrayList;
import java.util.List;

    public class Confections_2258 extends Paket2.Urun_2258 {
        public static List<Paket2.Confections_2258> confectionsList = new ArrayList<>();
        public Confections_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
            confectionsList.add(this);
        }
        protected static void SekerlemeUrunEkle(List<Paket2.Confections_2258> confectionsList, String adi, String birimAgirligi, double birimFiyati, int stokMiktari) {
            Paket2.Confections_2258 yeniUrun = new Paket2.Confections_2258(adi, 3, birimAgirligi, birimFiyati, stokMiktari);
            confectionsList.add(yeniUrun);
            System.out.println("Yeni şekerleme ürünü eklendi: " + yeniUrun.getAdi());
            System.out.println("Güncellenmiş şeker ürünleri listesi:");
            for (Paket2.Confections_2258 a : confectionsList) {
                System.out.println( a.getAdi() +
                        "\t" + a.getKategoriIndex() +
                        "\t" + a.getBirimAgirligi() +
                        "\t" + a.getBirimFiyati() +
                        "\t" + a.getStokMiktari());
            }
        }
    }
package Paket2;
import java.util.ArrayList;
import java.util.List;
    public class DairyProducts_2258 extends Paket2.Urun_2258 {
        String detay;
        public static List<Paket2.DairyProducts_2258> dairyProductsList = new ArrayList<>();
        public DairyProducts_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
            this.detay="özellik";
            dairyProductsList.add(this);
        }
        protected static void SutUrunleriDetayEkle(List<Paket2.DairyProducts_2258> dairyProductsList, String yeniDetay) {
            for (Paket2.DairyProducts_2258 dairyProduct : dairyProductsList) {
                dairyProduct.detay += " " + yeniDetay;
            }

            for (Paket2.DairyProducts_2258 b : dairyProductsList) {
                System.out.print( b.getAdi() +"\t");
                System.out.print( b.getKategoriIndex() +"\t");
                System.out.print(b.getBirimAgirligi() +"\t");
                System.out.print(b.getBirimFiyati() +"\t");
                System.out.print(b.getStokMiktari() +"\t");
                System.out.print(b.getDetay() +"\t");

                System.out.println();
            }
        }

        public String getDetay() {
            return detay;
        }

        public void setDetay(String detay) {
            this.detay = detay;
        }
    }
package Paket2;
import Paket1.Oku_2258;
import java.util.List;
import java.util.Scanner;

    public class Main_2258 {
        private static List<Paket2.Beverages_2258> beveragesList;
        private static List<Paket2.Cereals_2258> cerealsList;
        private static List<Paket2.Condiments_2258> condimentsList;
        private static List<Paket2.Confections_2258> confectionsList;
        private static List<Paket2.DairyProducts_2258> dairyProductsList;
        private static List<Paket2.Urun_2258> allProducts;

        public static void main(String[] args) {

            Paket1.Oku_2258.main();
            beveragesList = Paket1.Oku_2258.getBeveragesList();
            cerealsList = Paket1.Oku_2258.getCerealsList();
            condimentsList = Paket1.Oku_2258.getCondimentsList();
            confectionsList = Paket1.Oku_2258.getConfectionsList();
            dairyProductsList = Paket1.Oku_2258.getDairyProductsList();
            allProducts = Paket1.Oku_2258.tumUrunleriGetir();

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
                        Paket2.Beverages_2258.IcecekBirimAgirlikGuncelle("15");
                        break;
                    case 4:
                        Paket2.Condiments_2258.CesniStokGuncelle(condimentsList,true,2,8);
                        break;
                    case 5:
                        Paket2.Confections_2258.SekerlemeUrunEkle(confectionsList,"Elma Şekeri","100 gram",5.1,13);
                        break;
                    case 6:
                        Paket2.DairyProducts_2258.SutUrunleriDetayEkle(dairyProductsList,"yeni detay");
                        break;
                    case 7:
                        System.out.println("Silinecek ürünü giriniz:");
                        String urun= scanner.next();
                        Paket2.Cereals_2258.HububatSil( cerealsList,urun);
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
    package Paket2;

import Paket1.Oku_2258;

import java.util.List;

    public class Urun_2258 {
        public static java.util.List<Paket2.Urun_2258> allProducts = Paket1.Oku_2258.getAllProducts();
        String adi;
        int KategoriIndex;
        String BirimAgirligi;
        double BirimFiyati;
        int StokMiktari;
        public Urun_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
            this.adi = adi;
            this.KategoriIndex = kategoriIndex;
            this.BirimAgirligi = birimAgirligi;
            this.BirimFiyati = birimFiyati;
            this.StokMiktari = stokMiktari;

        }
        protected static void UrunleriFiyataGoreSil (List<Paket2.Urun_2258>allProducts, Double MinFiyat, Double MaxFiyat)  {
            allProducts.removeIf(urun -> {
                double birimFiyat = urun.getBirimFiyati();
                return birimFiyat >= MinFiyat && birimFiyat <= MaxFiyat;
            });
            System.out.println("Fiyat aralığındaki ürünler silindi.");
        }
        protected static void UrunKategorikStokGuncelle(String kategoriAdi, int X, List<Paket2.Beverages_2258> beveragesList, List<Paket2.Cereals_2258> cerealsList, List<Paket2.Condiments_2258> condimentsList, List<Paket2.Confections_2258> confectionsList, List<Paket2.DairyProducts_2258> dairyProductsList) {
            if(kategoriAdi=="beverages"){
                for (Paket2.Beverages_2258 urun : beveragesList) {
                    int stokMiktari = urun.getStokMiktari();
                    int yeniStok = stokMiktari + (stokMiktari *(X / 100) );
                    urun.setStokMiktari(yeniStok);
                }
            }
            else if(kategoriAdi=="cereals"){
                for (Paket2.Cereals_2258 urun : cerealsList) {
                    int stokMiktari = urun.getStokMiktari();
                    int yeniStok = stokMiktari + (stokMiktari *(X / 100) );
                    urun.setStokMiktari(yeniStok);
                }
            }
            else if(kategoriAdi=="condiments"){
                for (Paket2.Condiments_2258 urun : condimentsList) {
                    int stokMiktari = urun.getStokMiktari();
                    int yeniStok = stokMiktari + (stokMiktari *(X / 100) );
                    urun.setStokMiktari(yeniStok);
                }
            }
            else if(kategoriAdi=="confections"){
                for (Paket2.Confections_2258 urun : confectionsList) {
                    int stokMiktari = urun.getStokMiktari();
                    int yeniStok = stokMiktari + (stokMiktari *(X / 100) );
                    urun.setStokMiktari(yeniStok);
                }
            }
            else if(kategoriAdi=="dairyproducts"){
                for (Paket2.DairyProducts_2258 urun : dairyProductsList) {
                    int stokMiktari = urun.getStokMiktari();
                    int yeniStok = stokMiktari + (stokMiktari *(X / 100) );
                    urun.setStokMiktari(yeniStok);
                }
            }
            System.out.println(kategoriAdi + " kategorisindeki ürünlerin stokları güncellendi.");
        }

        public String getAdi() {
            return adi;
        }

        public void setAdi(String adi) {
            this.adi = adi;
        }

        public int getKategoriIndex() {
            return KategoriIndex;
        }

        public void setKategoriIndex(int kategoriIndex) {
            KategoriIndex = kategoriIndex;
        }

        public String getBirimAgirligi() {
            return BirimAgirligi;
        }

        public void setBirimAgirligi(String birimAgirligi) {
            BirimAgirligi = birimAgirligi;
        }

        public double getBirimFiyati() {
            return BirimFiyati;
        }

        public void setBirimFiyati(double birimFiyati) {
            BirimFiyati = birimFiyati;
        }

        public int getStokMiktari() {
            return StokMiktari;
        }

        public void setStokMiktari(int stokMiktari) {
            StokMiktari = stokMiktari;
        }
    }

}
*/