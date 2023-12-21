import java.util.ArrayList;
import java.util.List;

public class Urun_2258 {
    static java.util.List<Beverages_2258> beverages2258List = new ArrayList<>();
    static java.util.List<Cereals_2258> cereals2258List = new ArrayList<>();
    static java.util.List<Condiments_2258> condiments2258List = new ArrayList<>();
    static java.util.List<Confections_2258> confections2258List = new ArrayList<>();
    static List<DairyProducts_2258> dairyProducts2258List = new ArrayList<>();
    static java.util.List<Urun_2258> allProducts = new ArrayList<>();
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
    static void UrunFiyatGuncelle(int oran, List<Urun_2258> allProducts) {
        if (allProducts.isEmpty()) {
            System.out.println("Ürün bulunamadı.");
            return;
        }
        double zamOrani = oran / 100.0;
        for (Urun_2258 urun : allProducts) {
            urun.setBirimFiyati(urun.getBirimFiyati() * (1 + zamOrani));
        }

        for (Urun_2258 b : allProducts) {
            System.out.print(b.adi + "\t");
            System.out.print(b.KategoriIndex + "\t");
            System.out.print(b.BirimAgirligi + "\t");
            System.out.print(b.BirimFiyati + "\t");
            System.out.print(b.StokMiktari + "\t");
            System.out.println();
        }
    }
    public static void UrunFiyatGuncelle(int oran, int stokMiktari, List<Urun_2258> allProducts){
        if (allProducts.isEmpty()) {
            System.out.println("Ürün bulunamadı.");
            return;
        }
        double zamOrani = oran / 100.0;
        for (Urun_2258 urun : allProducts) {
            if(stokMiktari>urun.StokMiktari){
                urun.setBirimFiyati(urun.getBirimFiyati() * (1 + zamOrani));
            }
        }

        for (Urun_2258 b : allProducts) {
            System.out.print(b.adi + "\t");
            System.out.print(b.KategoriIndex + "\t");
            System.out.print(b.BirimAgirligi + "\t");
            System.out.print(b.BirimFiyati + "\t");
            System.out.print(b.StokMiktari + "\t");
            System.out.println();
        }
    }
    public void UrunStokGuncelle(int stokMiktari, boolean GirisMi,List<Urun_2258> allProducts){
        if (allProducts.isEmpty()) {
            System.out.println("Ürün bulunamadı.");
            return;
        }

        for (Urun_2258 urun : allProducts) {
            int mevcutStok=urun.getStokMiktari();
            if(GirisMi){
                urun.setStokMiktari(mevcutStok+stokMiktari);
            }
            else{
                urun.setStokMiktari(mevcutStok-stokMiktari);
            }
        }

        for (Urun_2258 b : allProducts) {
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
        Urun_2258.beverages2258List = beverages2258List;
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
