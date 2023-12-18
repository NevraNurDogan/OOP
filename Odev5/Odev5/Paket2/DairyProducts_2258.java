package Paket2;
import java.util.ArrayList;
import java.util.List;
public class DairyProducts_2258 extends Paket2.Urun_2258 {
    String detay;
    public static List<DairyProducts_2258> dairyProductsList = new ArrayList<>();
    public DairyProducts_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        this.detay="özellik";
        dairyProductsList.add(this);
    }
    protected static void SutUrunleriDetayEkle(List<DairyProducts_2258> dairyProductsList, String yeniDetay) {
        for (DairyProducts_2258 dairyProduct : dairyProductsList) {
            dairyProduct.detay += " " + yeniDetay;
        }

        for (DairyProducts_2258 b : dairyProductsList) {
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
