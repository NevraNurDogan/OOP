public class Confections_2258 extends Urun{
    private String detay;

    public Confections_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari, String detay) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        this.detay = detay;
    }
    public Confections_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);

    }
    public void sekerlemeDetayEkle(String adi, String yeniDetay) {
        if (this.adi.equals(adi)) {
            this.detay += yeniDetay;
            System.out.println("Detay başarıyla eklendi: " + yeniDetay);
        } else {
            System.out.println("Ürün bulunamadı.");
        }
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }
}

