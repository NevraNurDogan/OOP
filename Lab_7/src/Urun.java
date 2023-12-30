import java.util.ArrayList;
import java.util.List;

abstract class Urun implements IUrun {
    static List<Beverages> beveragesList = new ArrayList<>();
    static List<Cereals> cerealsList = new ArrayList<>();
    static List<Condiments> condimentsList = new ArrayList<>();
    static List<Confections> confectionsList = new ArrayList<>();
    static List<DairyProducts> dairyProductsList = new ArrayList<>();
    static List<Urun> allProducts = new ArrayList<>();
    protected String Adi;
    protected int KategoriIndex;
    protected String BirimAgirligi;
    protected double BirimFiyati;
    protected int StokMiktar;

    public Urun(String Adi, int KategoriIndex, String BirimAgirligi, double BirimFiyati, int StokMiktar) {
        this.Adi = Adi;
        this.KategoriIndex = KategoriIndex;
        this.BirimAgirligi = BirimAgirligi;
        this.BirimFiyati = BirimFiyati;
        this.StokMiktar = StokMiktar;
    }


    abstract void StokEnCokOlanUrunSil();


    @Override
    public void UrunStokGuncelle(int adet, boolean GirisMi) {
        for(Urun b: allProducts){
            int katsayi = 1;
            if (GirisMi && b.StokMiktar < 10 || !GirisMi && b.StokMiktar > 10) {
                b.StokMiktar += adet + katsayi;
                System.out.println("Stok güncellendi. Yeni stok miktarı: " + b.StokMiktar);
            }
        }

    }

    @Override
    public void UrunFiyatGuncelle(boolean indirimMi) {
        for(Urun b: allProducts){
            double oran = b.Adi.length();
            if (indirimMi) {
                b.BirimFiyati *= (1 - oran);
                System.out.println("Fiyat güncellendi. Yeni birim fiyat: " + b.BirimFiyati);
            }
        }
    }


    @Override
    public void YeniUrunEkle(String Ad, String BirimAgirligi, double BirimFiyatı, String detay) {

    }
}
