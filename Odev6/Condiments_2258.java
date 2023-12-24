import java.util.ArrayList;
import java.util.List;

public class Condiments_2258 extends Urun_2258 {
    public static List<Condiments_2258> condiments2258List = new ArrayList<>();
    public Condiments_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
    }
        public void CesniBirimAgirlikGuncelle(String yeniAgirlik) {
            Condiments_2258 enCokStoktaOlanCesni = null;
            int maxStok = Integer.MIN_VALUE;
            for (Condiments_2258 cesni : condiments2258List) {
                if (cesni.getStokMiktari() > maxStok) {
                    maxStok = cesni.getStokMiktari();
                    enCokStoktaOlanCesni = cesni;
                }
            }
            if (enCokStoktaOlanCesni != null) {
                enCokStoktaOlanCesni.setBirimAgirligi(yeniAgirlik);
            }
        }

        public void CesniBirimAgirlikGuncelle(String yeniAgirlik, int stokMiktarı) {
            Condiments_2258 enYakinStokluCesni = null;
            int enKucukFark = Integer.MAX_VALUE;

            for (Condiments_2258 cesni : condiments2258List) {
                int fark = Math.abs(cesni.getStokMiktari() - stokMiktarı);

                if (fark < enKucukFark) {
                    enKucukFark = fark;
                    enYakinStokluCesni = cesni;
                }
            }
            if (enYakinStokluCesni != null) {
                enYakinStokluCesni.setBirimAgirligi(yeniAgirlik);
            }
        }
    }


