public class Cereals extends Urun{
    String KategoriAdi;
    String detayBilgisi;

    public Cereals(String Adi, int KategoriIndex, String BirimAgirligi, double BirimFiyati, int StokMiktari, String KategoriAdi, String detayBilgisi) {
        super(Adi, KategoriIndex, BirimAgirligi, BirimFiyati, StokMiktari);
        this.KategoriAdi = KategoriAdi;
        this.detayBilgisi = detayBilgisi;
    }

    public void TahılMinStokEkle(int miktar) {

        if (this.StokMiktari < miktar) {
            this.StokMiktari += miktar;
            System.out.println("Tahıl ürününe stok eklendi: Eklenecek miktar -> " + miktar);
        } else {
            System.out.println("Stok miktarı zaten yeterli.");
        }
    }
}
