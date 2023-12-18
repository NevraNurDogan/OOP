import java.util.ArrayList;
import java.util.List;

public class Urun {
    static java.util.List<Beverages_2258> beverages2258List = new ArrayList<>();
    static java.util.List<Cereals_2258> cereals2258List = new ArrayList<>();
    static java.util.List<Condiments_2258> condiments2258List = new ArrayList<>();
    static java.util.List<Confections_2258> confections2258List = new ArrayList<>();
    static List<DairyProducts_2258> dairyProducts2258List = new ArrayList<>();
    static java.util.List<Urun> allProducts = new ArrayList<>();
    String adi;
    int KategoriIndex;
    String BirimAgirligi;
    double BirimFiyati;
    int StokMiktari;

    public Urun(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        this.adi = adi;
        this.KategoriIndex = kategoriIndex;
        this.BirimAgirligi = birimAgirligi;
        this.BirimFiyati = birimFiyati;
        this.StokMiktari = stokMiktari;
    }
    static void StokMiktarinaGoreUrunFiyatlariGuncelle (List<Beverages_2258> beverages2258List, int stokAdedi, int guncelFiyat){

        for (Beverages_2258 b : beverages2258List) {
            if (b.StokMiktari > stokAdedi) {
                b.BirimFiyati = guncelFiyat * (1 + (stokAdedi - b.StokMiktari) / 100.0);
            }
            else{
                b.BirimFiyati=b.BirimFiyati;
            }
        }
        for (Cereals_2258 cer : cereals2258List) {
            if (cer.StokMiktari > stokAdedi) {
                cer.BirimFiyati = guncelFiyat * (1 + (stokAdedi - cer.StokMiktari) / 100.0);
            }
            else{
                cer.BirimFiyati=cer.BirimFiyati;
            }
        }
        for (Condiments_2258 con : condiments2258List) {
            if (con.StokMiktari > stokAdedi) {
                con.BirimFiyati = guncelFiyat * (1 + (stokAdedi - con.StokMiktari) / 100.0);
            }
            else{
                con.BirimFiyati=con.BirimFiyati;
            }
        }
        for (Confections_2258 conf : confections2258List) {
            if (conf.StokMiktari > stokAdedi) {
                conf.BirimFiyati = guncelFiyat * (1 + (stokAdedi - conf.StokMiktari) / 100.0);
            }
            else{
                conf.BirimFiyati=conf.BirimFiyati;
            }
        }
        for (DairyProducts_2258 der : dairyProducts2258List) {
            if (der.StokMiktari > stokAdedi) {
                der.BirimFiyati = guncelFiyat * (1 + (stokAdedi - der.StokMiktari) / 100.0);
            }
            else{
                der.BirimFiyati=der.BirimFiyati;
            }
        }

    }

    static void UrunZamYap(int X, List<Urun> allProducts) {
        if (allProducts.isEmpty()) {
            System.out.println("Ürün bulunamadı.");
            return;
        }

        Urun enDusukFiyatliUrun = allProducts.get(0);
        double enDusukFiyat = enDusukFiyatliUrun.getBirimFiyati();

        for (Urun urun : allProducts) {
            if (urun.getBirimFiyati() < enDusukFiyat) {
                enDusukFiyat = urun.getBirimFiyati();
                enDusukFiyatliUrun = urun;
            }
        }

        double zamOrani = X / 100.0;
        enDusukFiyatliUrun.setBirimFiyati(enDusukFiyatliUrun.getBirimFiyati() * (1 + zamOrani));
        System.out.println("En düşük fiyatlı ürüne %" + X + " zam yapıldı.");

        for (Urun b : allProducts) {
            System.out.print(b.adi + "\t");
            System.out.print(b.KategoriIndex + "\t");
            System.out.print(b.BirimAgirligi + "\t");
            System.out.print(b.BirimFiyati + "\t");
            System.out.print(b.StokMiktari + "\t");
            System.out.println();
        }
    }


    public static List<Beverages_2258> getBeveragesList() {
        return beverages2258List;
    }

    public static void setBeveragesList(List<Beverages_2258> beverages2258List) {
        Urun.beverages2258List = beverages2258List;
    }

    public List<Cereals_2258> getCerealsList() {
        return cereals2258List;
    }

    public void setCerealsList(List<Cereals_2258> cereals2258List) {
        this.cereals2258List = cereals2258List;
    }

    public List<Condiments_2258> getCondimentsList() {
        return condiments2258List;
    }

    public void setCondimentsList(List<Condiments_2258> condiments2258List) {
        this.condiments2258List = condiments2258List;
    }

    public List<Confections_2258> getConfectionsList() {
        return confections2258List;
    }

    public void setConfectionsList(List<Confections_2258> confections2258List) {
        this.confections2258List = confections2258List;
    }

    public List<DairyProducts_2258> getDairyProductsList() {
        return dairyProducts2258List;
    }

    public void setDairyProductsList(List<DairyProducts_2258> dairyProducts2258List) {
        this.dairyProducts2258List = dairyProducts2258List;
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
