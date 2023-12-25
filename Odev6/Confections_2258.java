public class Confections_2258 extends Urun_2258 {
    private String detay;
    public Confections_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari, String detay) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        this.detay = detay;
    }
    public Confections_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
    }
    public static void UrunStokGuncelle(int stokMiktari, boolean GirisMi) {
        if (confections2258List.isEmpty()) {
            System.out.println("Confections kategorisinde güncellenecek ürün bulunamadı.");
            return;
        }
        for (Confections_2258 urun : confections2258List) {
            if ((urun.getStokMiktari() > 10 && !GirisMi) || (urun.getStokMiktari() < 20 && GirisMi)) {
                if (GirisMi) {
                    urun.setStokMiktari(urun.getStokMiktari() + stokMiktari);
                    System.out.println(urun.getAdi() + " adlı ürüne " + stokMiktari + " adet stok girişi yapıldı.");
                } else {
                    urun.setStokMiktari(urun.getStokMiktari() - stokMiktari);
                    System.out.println(urun.getAdi() + " adlı üründen " + stokMiktari + " adet stok çıkışı yapıldı.");
                }
            } else {
                System.out.println(urun.getAdi() + " adlı ürün için belirtilen koşullar sağlanmadığından işlem yapılmadı.");
            }
        }
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }
}

