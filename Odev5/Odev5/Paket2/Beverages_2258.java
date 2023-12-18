package Paket2;

import java.util.ArrayList;
import java.util.List;

public class Beverages_2258 extends Paket2.Urun_2258 {
    public static List<Beverages_2258> beveragesList = new ArrayList<>();
    public Beverages_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        beveragesList.add(this);
    }
    protected static void IcecekBirimAgirlikGuncelle(String yeniAgirlik) {
        int listSize = beveragesList.size();
        if (listSize > 0) {
            Beverages_2258 lastBeverage = beveragesList.get(listSize - 1);
            lastBeverage.setBirimAgirligi(yeniAgirlik);
            System.out.println("Ağırlık güncellendi: " + lastBeverage.getAdi() + " - Yeni ağırlık: " + lastBeverage.getBirimAgirligi());
        } else {
            System.out.println("Liste boş.");
        }
        for (Beverages_2258 b : beveragesList) {
            System.out.print( b.getAdi() +"\t");
            System.out.print( b.getKategoriIndex() +"\t");
            System.out.print(b.getBirimAgirligi() +"\t");
            System.out.print(b.getBirimFiyati() +"\t");
            System.out.print(b.getStokMiktari() +"\t");
            System.out.println();
        }
    }
}
