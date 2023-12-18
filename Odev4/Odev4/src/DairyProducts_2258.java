import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DairyProducts_2258 extends Urun{
    private static List<DairyProducts_2258> dairyProducts2258List = new ArrayList<>();
    public DairyProducts_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
    }

    static void SutUrunleriniSil(int minFiyat, int maxFiyat,List<DairyProducts_2258> dairyProducts2258List) {

        Iterator<DairyProducts_2258> iterator = dairyProducts2258List.iterator();

        while (iterator.hasNext()) {
            DairyProducts_2258 sutUrunu = iterator.next();
            if (sutUrunu.getBirimFiyati() >= minFiyat && sutUrunu.getBirimFiyati() <= maxFiyat) {
                System.out.println("Süt ürünü silindi: " + sutUrunu.getAdi());
                iterator.remove();
            } }
            for (Urun b : dairyProducts2258List) {
                System.out.print( b.adi+"\t");
                System.out.print( b.KategoriIndex+"\t");
                System.out.print(b.BirimAgirligi+"\t");
                System.out.print(b.BirimFiyati+"\t");
                System.out.print(b.StokMiktari+"\t");
                System.out.println();
            }

    }
}
