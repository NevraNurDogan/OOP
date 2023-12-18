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
        List<Urun_2258> allProducts = new ArrayList<>();
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
                        Urun_2258 beverages = new Beverages_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        beveragesList.add((Beverages_2258) beverages);
                    } else if (kategoriIndex == 2) {
                        Urun_2258 condiments = new Condiments_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        condimentsList.add((Condiments_2258) condiments);
                    } else if (kategoriIndex == 3) {
                        Urun_2258 confections = new Confections_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        confectionsList.add((Confections_2258) confections);
                    } else if (kategoriIndex == 4) {
                        Urun_2258 dairyProducts = new DairyProducts_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        dairyProductsList.add((DairyProducts_2258) dairyProducts);
                    } else if (kategoriIndex == 5) {
                        Urun_2258 cereals = new Cereals_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                        cerealsList.add((Cereals_2258) cereals);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ürün listesi");
    }
    public static void yaz(List<Urun_2258> allProducts){
        for (Urun_2258 b :allProducts) {
            System.out.print( b.getAdi() +"\t");
            System.out.print( b.getKategoriIndex() +"\t");
            System.out.print(b.getBirimAgirligi() +"\t");
            System.out.print(b.getBirimFiyati() +"\t");
            System.out.print(b.getStokMiktari() +"\t");
            System.out.println();
        }
    }
    public static List<Urun_2258> tumUrunleriGetir() {
        List<Urun_2258> allProducts = new ArrayList<>();
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
    public static List<Urun_2258> getAllProducts() {
        return allProducts;
    }


}
