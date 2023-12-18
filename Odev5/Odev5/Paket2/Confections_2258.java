package Paket2;

import java.util.ArrayList;
import java.util.List;

public class Confections_2258 extends Paket2.Urun_2258 {
    public static List<Confections_2258> confectionsList = new ArrayList<>();
    public Confections_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        confectionsList.add(this);
    }
    protected static void SekerlemeUrunEkle(List<Confections_2258> confectionsList, String adi, String birimAgirligi, double birimFiyati, int stokMiktari) {
        Confections_2258 yeniUrun = new Confections_2258(adi, 3, birimAgirligi, birimFiyati, stokMiktari);
        confectionsList.add(yeniUrun);
        System.out.println("Yeni şekerleme ürünü eklendi: " + yeniUrun.getAdi());
        System.out.println("Güncellenmiş şeker ürünleri listesi:");
        for (Confections_2258  a : confectionsList) {
            System.out.println( a.getAdi() +
                    "\t" + a.getKategoriIndex() +
                    "\t" + a.getBirimAgirligi() +
                    "\t" + a.getBirimFiyati() +
                    "\t" + a.getStokMiktari());
        }
    }
}