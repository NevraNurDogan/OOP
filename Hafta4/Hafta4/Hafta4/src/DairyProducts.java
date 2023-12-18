public class DairyProducts extends Urun {
    String KategoriAdi;
    String detayBilgisi;

    public DairyProducts(String Adi, int KategoriIndex, String BirimAgirligi, double BirimFiyati, int StokMiktari, String KategoriAdi, String detayBilgisi) {
        super(Adi, KategoriIndex, BirimAgirligi, BirimFiyati, StokMiktari);
        this.KategoriAdi = KategoriAdi;
        this.detayBilgisi = detayBilgisi;
    }

    public void SutUrunuSil() {
        if (this.BirimFiyati > 2.0) {
            System.out.println("Süt ürünü silindi: Silinen ürün adı -> " + this.Adi);
        } else {
            System.out.println("Silmek için uygun süt ürünü bulunamadı.");
        }
    }
}
