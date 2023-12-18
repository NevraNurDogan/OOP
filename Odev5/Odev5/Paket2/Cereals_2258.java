package Paket2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Cereals_2258 extends Paket2.Urun_2258 {
    public static List<Cereals_2258> cerealsList = new ArrayList<>();
    public Cereals_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
        cerealsList.add(this);
    }
    protected static void HububatSil(List<Cereals_2258> cerealsList, String urunAdi) {
        List<Cereals_2258> silinecekler = new ArrayList<>();

        for (Cereals_2258 tahilUrunu : cerealsList) {
            if (tahilUrunu.getAdi().equals(urunAdi)) {
                silinecekler.add(tahilUrunu);
            }
        }

        for (Cereals_2258 silinecek : silinecekler) {
            cerealsList.remove(silinecek);
        }

        for (Cereals_2258 tahilUrunu : cerealsList) {
            System.out.println(tahilUrunu.getAdi() +
                    "\t" + tahilUrunu.getKategoriIndex() +
                    "\t" + tahilUrunu.getBirimAgirligi() +
                    "\t" + tahilUrunu.getBirimFiyati() +
                    "\t" + tahilUrunu.getStokMiktari());
        }
    }
}
