import java.util.ArrayList;
import java.util.List;

public class Urun_2258 {
    static List<Beverages_2258> beverages2258List = new ArrayList<>();
    static List<Cereals_2258> cereals2258List = new ArrayList<>();
    static List<Condiments_2258> condiments2258List = new ArrayList<>();
    static List<Confections_2258> confections2258List = new ArrayList<>();
    static List<DairyProducts_2258> dairyProducts2258List = new ArrayList<>();
    static List<Urun_2258> allProducts = new ArrayList<>();
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
    public  static void UrunFiyatGuncelle(int oran) {
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
    public static void UrunFiyatGuncelle(int oran, int stokMiktari){
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
    public static void UrunStokGuncelle(int stokMiktari, boolean GirisMi){
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
    public static void UrunKategorikZamYap (String KategoriAdi){
        double zamOrani;
        switch (KategoriAdi) {
            case "Beverages":
                for (Beverages_2258 b : beverages2258List) {
                    if(b.StokMiktari>10){
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + zamOrani));
                    }
                    else{
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + (zamOrani*2)));
                    }
                }
                break;
            case "Cereals":
                for (Cereals_2258 b : cereals2258List) {
                    if(b.StokMiktari>10){
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + zamOrani));
                    }
                    else{
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + (zamOrani*2)));
                    }
                }
                break;
            case "Condiments":
                for (Condiments_2258 b : condiments2258List) {
                    if(b.StokMiktari>10){
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + zamOrani));
                    }
                    else{
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + (zamOrani*2)));
                    }
                }
                break;
            case "Confections":
                for (Confections_2258 b : confections2258List) {
                    if(b.StokMiktari>10){
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + zamOrani));
                    }
                    else{
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + (zamOrani*2)));
                    }
                }
                break;
            case "DairyProducts":
                for (DairyProducts_2258 b : dairyProducts2258List) {
                    if(b.StokMiktari>10){
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + zamOrani));
                    }
                    else{
                        zamOrani = b.getAdi().length() / 100.0;
                        b.setBirimFiyati(b.getBirimFiyati() * (1 + (zamOrani*2)));
                    }
                }
                break;
            default:

                break;
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
