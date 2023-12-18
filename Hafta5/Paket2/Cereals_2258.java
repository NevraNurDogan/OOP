package Paket2;

import java.util.ArrayList;
import java.util.List;
public class Cereals_2258 extends Urun_2258 {
    public static List<Cereals_2258> cerealsList = new ArrayList<>();
    public Cereals_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
        cerealsList.add(this);
    }
    protected static void TahılMinStokEkle( List<Cereals_2258> cerealsList,int miktar) {
        if (cerealsList.isEmpty()) {
            System.out.println("Tahıl listesi boş.");
            return;
        }
        Cereals_2258 enAzStokluTahil = cerealsList.get(0);
        for (Cereals_2258 tahilUrunu : cerealsList) {
            if (tahilUrunu.getStokMiktari() < enAzStokluTahil.getStokMiktari()) {
                enAzStokluTahil = tahilUrunu;
            }
        }
        enAzStokluTahil.setStokMiktari(enAzStokluTahil.getStokMiktari() + miktar);
        System.out.println("En az stoğa sahip tahıl ürününe stok eklendi");
        for (Cereals_2258 tahilUrunu : cerealsList) {
            System.out.println( tahilUrunu.getAdi() +
                    "\t" + tahilUrunu.getKategoriIndex() +
                    "\t" + tahilUrunu.getBirimAgirligi() +
                    "\t" + tahilUrunu.getBirimFiyati() +
                    "\t" + tahilUrunu.getStokMiktari());
        }
    }
}
