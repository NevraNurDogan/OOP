package Paket2;

import Paket1.Oku_2258;

import java.util.List;

public class Urun_2258 {
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
    protected static void UrunleriFiyataGoreSil (List<Urun_2258>allProducts,Double MinFiyat, Double MaxFiyat)  {
    allProducts.removeIf(urun -> {
        double birimFiyat = urun.getBirimFiyati();
        return birimFiyat >= MinFiyat && birimFiyat <= MaxFiyat;
    });
        System.out.println("Fiyat aralığındaki ürünler silindi.");
}
    protected static void UrunKategorikStokGuncelle(String kategoriAdi, int X, List<Beverages_2258> beveragesList, List<Cereals_2258> cerealsList, List<Condiments_2258> condimentsList, List<Confections_2258> confectionsList, List<DairyProducts_2258> dairyProductsList) {
        if(kategoriAdi=="beverages"){
            for (Beverages_2258 urun : beveragesList) {
                int stokMiktari = urun.getStokMiktari();
                int yeniStok = stokMiktari + (stokMiktari *(X / 100) );
                urun.setStokMiktari(yeniStok);
            }
        }
        else if(kategoriAdi=="cereals"){
            for (Cereals_2258 urun : cerealsList) {
                int stokMiktari = urun.getStokMiktari();
                int yeniStok = stokMiktari + (stokMiktari *(X / 100) );
                urun.setStokMiktari(yeniStok);
            }
        }
        else if(kategoriAdi=="condiments"){
            for (Condiments_2258 urun : condimentsList) {
                int stokMiktari = urun.getStokMiktari();
                int yeniStok = stokMiktari + (stokMiktari *(X / 100) );
                urun.setStokMiktari(yeniStok);
            }
        }
        else if(kategoriAdi=="confections"){
            for (Confections_2258 urun : confectionsList) {
                int stokMiktari = urun.getStokMiktari();
                int yeniStok = stokMiktari + (stokMiktari *(X / 100) );
                urun.setStokMiktari(yeniStok);
            }
        }
        else if(kategoriAdi=="dairyproducts"){
            for (DairyProducts_2258 urun : dairyProductsList) {
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
