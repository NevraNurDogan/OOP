public class Confections extends  Urun{
    String KategoriAdi;
    String detayBilgisi;

    public Confections(String Adi, int KategoriIndex, String BirimAgirligi, double BirimFiyati, int StokMiktari, String KategoriAdi, String detayBilgisi) {
        super(Adi, KategoriIndex, BirimAgirligi, BirimFiyati, StokMiktari);
        this.KategoriAdi = KategoriAdi;
        this.detayBilgisi = detayBilgisi;
    }

    public void SekerlemeDetaySil() {
        String[] detaylar = this.detayBilgisi.split(",");
        if (detaylar.length > 0) {
            String silinecekDetay = detaylar[detaylar.length - 1].trim();
            this.detayBilgisi = this.detayBilgisi.replace(silinecekDetay, "").trim();
            System.out.println("Şekerleme detayı silindi: Silinen detay -> " + silinecekDetay);
        } else {
            System.out.println("Silmek için detay bulunamadı.");
        }
    }
}
