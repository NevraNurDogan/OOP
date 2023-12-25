public class Condiments_2258 extends Urun_2258 {
    public Condiments_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
    }
        public static void CesniBirimAgirlikGuncelle(String yeniAgirlik) {
            Condiments_2258 enCokStoktaOlanCesni = null;
            int maxStok = Integer.MIN_VALUE;
            for (Condiments_2258 cesni : condiments2258List) {
                if (cesni.getStokMiktari() > maxStok) {
                    maxStok = cesni.getStokMiktari();
                    enCokStoktaOlanCesni = cesni;
                }
            }
            System.out.println("En çok stoğu olan ürün:"+enCokStoktaOlanCesni.getAdi());
            if (enCokStoktaOlanCesni != null) {
                enCokStoktaOlanCesni.setBirimAgirligi(yeniAgirlik);
                System.out.println("En çok stoğu olan ürün ağırlığı güncellendi:"+enCokStoktaOlanCesni.getAdi()+"->"+yeniAgirlik);
            }
        }
        public  static void CesniBirimAgirlikGuncelle(String yeniAgirlik, int stokMiktarı) {
            Condiments_2258 enYakinStokluCesni = null;
            int enKucukFark = Integer.MAX_VALUE;

            for (Condiments_2258 cesni : condiments2258List) {
                int fark = Math.abs(cesni.getStokMiktari() - stokMiktarı);

                if (fark < enKucukFark) {
                    enKucukFark = fark;
                    enYakinStokluCesni = cesni;
                }
            }
            System.out.println("Stoğa en yakın olan ürün:"+enYakinStokluCesni.getAdi());
            if (enYakinStokluCesni != null) {
                enYakinStokluCesni.setBirimAgirligi(yeniAgirlik);
                System.out.println("Stoğa en yakın olan ürünün ağırlığı güncellendi:"+enYakinStokluCesni.getAdi()+"->"+yeniAgirlik);
            }
        }
    }


