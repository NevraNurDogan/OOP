import java.util.ArrayList;
import java.util.List;

abstract class Urun_2258 implements IUrun_2258 {
    static List<Beverages_2258> beveragesList = new ArrayList<>();
    static List<Cereals_2258> cerealsList = new ArrayList<>();
    static List<Condiments_2258> condimentsList = new ArrayList<>();
    static List<Confections_2258> confectionsList = new ArrayList<>();
    static List<DairyProducts_2258> dairyProductsList = new ArrayList<>();
    static List<Urun_2258> allProducts = new ArrayList<>();
    protected String Adi;
    protected int KategoriIndex;
    protected String BirimAgirligi;
    protected double BirimFiyati;
    protected int StokMiktar;
    int Katsayi;
    String KategoriAdi;
    String detay;

    public Urun_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktar, int katsayi, String kategoriAdi, String detay) {
        this.Adi = adi;
        this.KategoriIndex = kategoriIndex;
        this.BirimAgirligi = birimAgirligi;
        this.BirimFiyati = birimFiyati;
        this.StokMiktar = stokMiktar;
        this.Katsayi = katsayi;
        this.KategoriAdi = kategoriAdi;
        this.detay = detay;
    }

    abstract void UrunFiyatGuncelle(List<? extends Urun_2258> selectedClass, int index, int oran, boolean indirimMi);

    abstract void UrunKategorikZamYap(List<? extends Urun_2258> selectedClass, int index, int X);

    @Override
    public void UrunStokGuncelle(List<? extends Urun_2258> selectedClass, int index, int adet, boolean GirisMi) {
        if (index >= 0 && index < selectedClass.size()) {
            Urun_2258 b = selectedClass.get(index);

            if (GirisMi) {
                b.StokMiktar += adet;
                System.out.println("Stok güncellendi. Yeni stok miktarı: " + b.Adi + "->" + b.StokMiktar);
            } else {
                if (b.StokMiktar >= adet) {
                    b.StokMiktar -= adet;
                    System.out.println("Stok güncellendi. Yeni stok miktarı: " + b.Adi + "->" + b.StokMiktar);
                } else {
                    System.out.println("Stok yetersiz! Çıkış işlemi gerçekleştirilemedi.");
                }
            }
        } else {
            System.out.println("Geçersiz indeks! Lütfen geçerli bir indeks girin.");
        }
    }

    @Override
    public void UrunIsimGuncelle(List<? extends Urun_2258> selectedClass, int index, String yeniIsim, String yeniDetay) {
        if (index >= 0 && index < selectedClass.size()) {
            Urun_2258 b = selectedClass.get(index);
            b.Adi = yeniIsim;
            b.detay = yeniDetay;
            System.out.println("İsim ve detay güncellendi.");
            System.out.println("Yeni isim:" + yeniIsim);
            System.out.println("Yeni detay:" + yeniDetay);
        } else {
            System.out.println("Geçersiz indeks! Lütfen geçerli bir indeks girin.");
        }

    }

    public void UrunSil(List<? extends Urun_2258> selectedClass, int index) {
        if (index >= 0 && index < selectedClass.size()) {
            Urun_2258 urunToBeDeleted = selectedClass.get(index);
            selectedClass.remove(urunToBeDeleted);
            System.out.println("Ürün silindi.->" + urunToBeDeleted.Adi);
        } else {
            System.out.println("Geçersiz indeks! Lütfen geçerli bir indeks girin.");
        }
    }

    @Override
    public void YeniUrunEkle(List<? extends Urun_2258> selectedClass, String Adi, double BirimAgirligi, double BirimFiyati, String Detay) {
        Urun_2258 yeniUrun = null;

        if (selectedClass.size() > 0) {
            int kategoriIndex = selectedClass.get(0).KategoriIndex;
            if (kategoriIndex == 1) {
                yeniUrun = new Beverages_2258(Adi, kategoriIndex, String.valueOf(BirimAgirligi), BirimFiyati, 0, 1, "beverages", Detay);
            } else if (kategoriIndex == 2) {
                yeniUrun = new Condiments_2258(Adi, kategoriIndex, String.valueOf(BirimAgirligi), BirimFiyati, 0, 2, "condiments", Detay);
            } else if (kategoriIndex == 3) {
                yeniUrun = new Confections_2258(Adi, kategoriIndex, String.valueOf(BirimAgirligi), BirimFiyati, 0, 3, "confections", Detay);
            } else if (kategoriIndex == 4) {
                yeniUrun = new DairyProducts_2258(Adi, kategoriIndex, String.valueOf(BirimAgirligi), BirimFiyati, 0, 4, "dairyProducts", Detay);
            } else if (kategoriIndex == 5) {
                yeniUrun = new Cereals_2258(Adi, kategoriIndex, String.valueOf(BirimAgirligi), BirimFiyati, 0, 5, "cereals", Detay);
            }
            if (yeniUrun != null) {
               // selectedClass.add(yeniUrun);// bu kısımda ilk başta seçtğim kategorinin indexini alıp ona göre eşleşen listeye eklemesini istedim.
                // Ama ekleme kısmında bir hata mesajı aldım düzeltemedim.
                System.out.println("Yeni ürün eklendi. -> " + yeniUrun.Adi);
            } else {
                System.out.println("Geçersiz kategori index'i! Yeni ürün eklenemedi.");
            }
        } else {
            System.out.println("Liste boş! Yeni ürün eklenemedi.");
        }
    }
}
