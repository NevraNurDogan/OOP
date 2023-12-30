public class Cereals extends Urun {
    int Katsayi;
    String KategoriAdi;
    String detay;
    public Cereals(String ad, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari, int Katsayi,String KategoriAdi,String detay) {
        super(ad, kategoriIndex, birimAgirligi, birimFiyatı, stokMiktari);
        this.Katsayi=5;
        this.KategoriAdi="Cereals";
        this.detay="detay";
    }


    @Override
    public void UrunBirimAgirlikGüncelle(int X) {

    }

    @Override
    void StokEnCokOlanUrunSil() {
        int maxStok = Integer.MIN_VALUE;
        Urun urunToBeDeleted = null;

        for (Cereals a : cerealsList) {
            if (a.StokMiktar > maxStok) {
                maxStok = a.StokMiktar;
                Cereals aToBeDeleted = a;
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
