package Paket2;

import Paket1.Oku_2258;

import java.util.ArrayList;
import java.util.List;

public class Urun_2258 {
    static java.util.List<Beverages_2258> beveragesList = Oku_2258.getBeveragesList();
    static java.util. List<Cereals_2258> cerealsList = Oku_2258.getCerealsList();
    static java.util.List<Condiments_2258> condimentsList = Oku_2258.getCondimentsList();
    static java.util.List<Confections_2258> confectionsList =Oku_2258.getConfectionsList();
    static java.util.List<DairyProducts_2258> dairyProductsList =Oku_2258.getDairyProductsList();
    public static java.util.List<Urun_2258> allProducts = Oku_2258.getAllProducts();

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
    protected static void UrunStokGuncelle(List<Urun_2258> allProducts,String UrunAdi, boolean satisMi, int adet) {
        for (Urun_2258 urun : allProducts) {
            if (urun.getAdi().equalsIgnoreCase(UrunAdi)) {
                if (satisMi) {
                    urun.setStokMiktari(urun.getStokMiktari() - adet);
                } else {
                    urun.setStokMiktari(urun.getStokMiktari() + adet);
                }
                System.out.println("Stok güncellendi: " + urun.getAdi());
                return;
            }
        }
        System.out.println("Ürün bulunamadı.");
    }
    protected static void UrunAdiDegistir(List<Urun_2258> allProducts,String eskiAd, String yeniAd) {
        for (Urun_2258 urun : allProducts) {
            if (urun.getAdi().equals(eskiAd)) {
                urun.setAdi(yeniAd);
                System.out.println("Ürün adı güncellendi: " + yeniAd);
                return;
            }
        }
        System.out.println("Ürün bulunamadı.");
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
