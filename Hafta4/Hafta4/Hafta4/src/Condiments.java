public class Condiments extends  Urun{
    String KategoriAdi;
    String detayBilgisi;

    public Condiments(String Adi, int KategoriIndex, String BirimAgirligi, double BirimFiyati, int StokMiktari, String KategoriAdi, String detayBilgisi) {
        super(Adi, KategoriIndex, BirimAgirligi, BirimFiyati, StokMiktari);
        this.KategoriAdi = KategoriAdi;
        this.detayBilgisi = detayBilgisi;
    }
    public void CesniBirimFiyatGuncelle(double yeniFiyat) {
        this.BirimFiyati = yeniFiyat;
        System.out.println("Çeşni birim fiyatı güncellendi: Yeni fiyat -> " + yeniFiyat);
    }

}
