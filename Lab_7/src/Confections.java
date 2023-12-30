public class Confections extends Urun {
    int Katsayi;
    String KategoriAdi;
    String detay;
    public Confections(String ad, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari, int Katsayi,String KategoriAdi,String detay) {
        super(ad, kategoriIndex, birimAgirligi, birimFiyatı, stokMiktari);
        this.Katsayi=3;
        this.KategoriAdi="Confections";
        this.detay="detay";
    }


    @Override
    public void UrunBirimAgirlikGüncelle(int X) {

    }

    @Override
    void StokEnCokOlanUrunSil() {
        int maxStok = Integer.MIN_VALUE;
        Urun urunToBeDeleted = null;

        for (Confections a : confectionsList) {
            if (a.StokMiktar > maxStok) {
                maxStok = a.StokMiktar;
                Confections aToBeDeleted = a;
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
