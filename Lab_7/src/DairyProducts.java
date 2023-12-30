public class DairyProducts extends Urun {
    int Katsayi;
    String KategoriAdi;
    String detay;
    public DairyProducts(String ad, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari, int Katsayi,String KategoriAdi,String detay) {
        super(ad, kategoriIndex, birimAgirligi, birimFiyatı, stokMiktari);
        this.Katsayi=4;
        this.KategoriAdi="DairyProducts";
        this.detay="detay";
    }


    @Override
    public void UrunBirimAgirlikGüncelle(int X) {

    }

    void StokEnCokOlanUrunSil() {
        int maxStok = Integer.MIN_VALUE;
        Urun urunToBeDeleted = null;

        for (DairyProducts a : dairyProductsList) {
            if (a.StokMiktar > maxStok) {
                maxStok = a.StokMiktar;
                DairyProducts aToBeDeleted = a;
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
