package Paket2;

import java.util.ArrayList;
import java.util.List;

public class Condiments_2258 extends Urun_2258 {
    public static List<Condiments_2258> condimentsList = new ArrayList<>();
    public Condiments_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
        condimentsList.add(this);
    }
    protected static void CesniBirimFiyatGuncelle(List<Condiments_2258> condiments2258List,String adi,double yeniFiyat){
        for (Condiments_2258 condiments2258 : condimentsList) {
            if (condiments2258.getAdi().equals(adi)) {
                condiments2258.BirimFiyati = yeniFiyat;
                System.out.println("Birim fiyatı  güncellendi: " + adi+">>"+yeniFiyat);
            }
    }
            for (Condiments_2258 b : condimentsList) {
                System.out.print( b.getAdi() +"\t");
                System.out.print( b.getKategoriIndex() +"\t");
                System.out.print(b.getBirimAgirligi() +"\t");
                System.out.print(b.getBirimFiyati() +"\t");
                System.out.print(b.getStokMiktari() +"\t");
                System.out.println();
            }
    }
}

