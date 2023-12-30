public class Beverages extends Urun{
    int Katsayi;
    String KategoriAdi;
    String detay;
    public Beverages(String ad, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari, int Katsayi,String KategoriAdi,String detay) {
        super(ad, kategoriIndex, birimAgirligi, birimFiyatı, stokMiktari);
        this.Katsayi=1;
        this.KategoriAdi="Beverages";
        this.detay="detay";
    }

    @Override
    public void UrunBirimAgirlikGüncelle(int X) {

    }

    @Override
    void StokEnCokOlanUrunSil() {
        int maxStok = Integer.MIN_VALUE;
        Urun urunToBeDeleted = null;

        for (Beverages a : beveragesList) {
            if (a.StokMiktar > maxStok) {
                maxStok = a.StokMiktar;
                Beverages aToBeDeleted = a;
            }
        }

        if (urunToBeDeleted != null) {
            beveragesList.remove(urunToBeDeleted);
            System.out.println("Stok miktarı en yüksek ürün silindi.");
        } else {
            System.out.println("Listede silinecek ürün bulunamadı.");
        }
    }
}

