package Paket2;

import java.util.ArrayList;
import java.util.List;

public class Beverages_2258 extends Urun_2258 {
    public static List<Beverages_2258> beveragesList = new ArrayList<>();
    public Beverages_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        beveragesList.add(this);
    }
    protected static void IcecekUrunuEkle(String Adi, int KategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,List<Beverages_2258> beveragesList) {
        Urun_2258 beverages = new Beverages_2258(Adi ,KategoriIndex,birimAgirligi,birimFiyati, stokMiktari);
        beveragesList.add((Beverages_2258) beverages);
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
