package Paket2;

import java.util.ArrayList;
import java.util.List;

public class Condiments_2258 extends Paket2.Urun_2258 {
    public static List<Condiments_2258> condimentsList = new ArrayList<>();
    public Condiments_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
        condimentsList.add(this);
    }
    protected static void CesniStokGuncelle(List<Condiments_2258> condimentsList, boolean Satismi, int index, int miktar) {
        if (index >= 1 && index <= condimentsList.size()) {
            Condiments_2258 cesni = condimentsList.get(index - 1);

            if (Satismi) {
                if (cesni.getStokMiktari() >= miktar) {
                    cesni.setStokMiktari(cesni.getStokMiktari() - miktar);
                    System.out.println("Satış yapıldı. Yeni stok miktarı: " + cesni.getStokMiktari());
                } else {
                    System.out.println("Yetersiz stok, satış yapılamadı.");
                }
            } else {
                cesni.setStokMiktari(cesni.getStokMiktari() + miktar);
                System.out.println("Stok girişi yapıldı. Yeni stok miktarı: " + cesni.getStokMiktari());
            }
            for (Condiments_2258 b : condimentsList) {
                System.out.print(b.getAdi() + "\t");
                System.out.print(b.getKategoriIndex() + "\t");
                System.out.print(b.getBirimAgirligi() + "\t");
                System.out.print(b.getBirimFiyati() + "\t");
                System.out.print(b.getStokMiktari() + "\t");
                System.out.println();
            }
        } else {
            System.out.println("Geçersiz index, çeşni bulunamadı.");
        }
    }
}
