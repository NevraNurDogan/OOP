import java.util.ArrayList;
import java.util.List;

public class DairyProducts_2258 extends Urun_2258 {
    public DairyProducts_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
    }

    public  static void SutUrunuSil(double fiyat){
        List<DairyProducts_2258> silinecekUrunler = new ArrayList<>();
        for (DairyProducts_2258 b : dairyProducts2258List) {
            if (b.BirimFiyati > fiyat) {
                silinecekUrunler.add(b);
                System.out.println("Süt ürünü silindi: " + b.getAdi());
            }
        }
        dairyProducts2258List.removeAll(silinecekUrunler);

        for (DairyProducts_2258 b : dairyProducts2258List) {
            System.out.print(b.adi + "\t");
            System.out.print(b.KategoriIndex + "\t");
            System.out.print(b.BirimAgirligi + "\t");
            System.out.print(b.BirimFiyati + "\t");
            System.out.print(b.StokMiktari + "\t");
            System.out.println();
        }
    }
        public static void SutUrunuSil() {
            if (dairyProducts2258List.isEmpty()) {
                System.out.println("DairyProducts kategorisinde silinecek ürün bulunamadı.");
                return;
            }

            DairyProducts_2258 enAzStokluUrun = dairyProducts2258List.get(0);
            for (DairyProducts_2258 urun : dairyProducts2258List) {
                if (urun.getStokMiktari() < enAzStokluUrun.getStokMiktari()) {
                    enAzStokluUrun = urun;
                }
            }
            dairyProducts2258List.remove(enAzStokluUrun);

            System.out.println("DairyProducts kategorisinde en az stoğa sahip olan ürün silindi.");
        }
    public  static void SutUrunuSil(int minStok, int maxStok, double fiyat){
        List<DairyProducts_2258> silinecekUrunler = new ArrayList<>();
        for (DairyProducts_2258 b : dairyProducts2258List) {
            if(b.StokMiktari>minStok && b.StokMiktari<maxStok){
                if (b.BirimFiyati < fiyat) {
                    silinecekUrunler.add(b);
                    System.out.println("Süt ürünü silindi: " + b.getAdi());
                }
            }

        }
        dairyProducts2258List.removeAll(silinecekUrunler);
        for (DairyProducts_2258 b : dairyProducts2258List) {
            System.out.print(b.adi + "\t");
            System.out.print(b.KategoriIndex + "\t");
            System.out.print(b.BirimAgirligi + "\t");
            System.out.print(b.BirimFiyati + "\t");
            System.out.print(b.StokMiktari + "\t");
            System.out.println();
        }
    }
}

