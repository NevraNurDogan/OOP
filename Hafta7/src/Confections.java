public class Confections extends Urun {
    int Katsayi;
    String KategoriAdi;
    String detay;

    public Confections(String Adi, int KategoriIndex, String BirimAgirligi, double BirimFiyati, int StokMiktar, int katsayi, String kategoriAdi, String detay) {
        super(Adi, KategoriIndex, BirimAgirligi, BirimFiyati, StokMiktar);
        Katsayi = katsayi;
        KategoriAdi = kategoriAdi;
        this.detay = detay;
    }

    @Override
    void EnKisaIsimliUrunIsimGuncelle(String yeniIsim, String yeniDetay) {
        String enKisaIsim = "";
        int enKisaIsimUzunluk = Integer.MAX_VALUE;

        for (Confections a: confectionsList) {
            if (a.Adi.length() < enKisaIsimUzunluk) {
                enKisaIsim = a.Adi;
                enKisaIsimUzunluk = a.Adi.length();
            }
        }

        for (Confections a : confectionsList) {
            if (a.Adi.equals(enKisaIsim)) {
                a.Adi = yeniIsim;
                a.detay = yeniDetay;
                System.out.println("En kısa isimli ürünün ismi ve detayı güncellendi.");
                break;
            }
        }
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

    @Override
    void EnPahaliUrunFiyatGuncelle() {
        Urun enPahaliUrun = null;
        double maxFiyat = Double.MIN_VALUE;
        for (Confections a : confectionsList) {
            if (a.BirimFiyati > maxFiyat) {
                maxFiyat = a.BirimFiyati;
                enPahaliUrun = a;
            }
        }
        if (enPahaliUrun != null) {
            enPahaliUrun.BirimFiyati -= enPahaliUrun.BirimFiyati * 0.50;
            System.out.println("En pahalı ürüne %50 indirim uygulandı. Yeni birim fiyat: " + enPahaliUrun.BirimFiyati);
        } else {
            System.out.println("Listede ürün bulunamadı.");
        }
    }

    @Override
    void DetayGuncelle() {
        for (Confections a : confectionsList) {
            a.detay = "Yeni Detay";
            System.out.println("Detay güncellendi. Yeni detay: " + a.detay);
        }
    }
}
