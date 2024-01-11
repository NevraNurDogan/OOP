import java.util.ArrayList;
import java.util.List;
class Urun {
    static List<Beverages> beveragesList = new ArrayList<>();
    static List<Condiments> condimentsList = new ArrayList<>();
    static List<Confections> confectionsList = new ArrayList<>();
    static List<DairyProducts> dairyProductsList = new ArrayList<>();
    static List<Cereals> cerealsList = new ArrayList<>();
    static String Adi;
    static double BirimAgirligi;
    static double BirimFiyati;
    static int StokMiktari;
    public Urun(String adi, double birimAgirligi, double birimFiyati, int stokMiktari) {
        Adi = adi;
        BirimAgirligi = birimAgirligi;
        BirimFiyati = birimFiyati;
        StokMiktari = stokMiktari;
    }
    public void UrunStokGuncelle(String urunAdi, boolean satisMi, int adet) {
        if (Adi.equals(urunAdi) && StokMiktari > 0) {
            if (satisMi && StokMiktari >= adet) {
                StokMiktari -= adet;
                System.out.println("Stok güncellendi. Yeni stok miktarı: " + StokMiktari);
            } else {
                System.out.println("Stok yetersiz! Satış işlemi gerçekleştirilemedi.");
            }
        } else {
            System.out.println("Ürün bulunamadı veya stokta yok!");
        }
    }
    public void UrunAdiDegistir(String yeniAdi) {
        Adi = yeniAdi;
        System.out.println("Ürün adı değiştirildi. Yeni ad: " + Adi);
    }
    static class Beverages   {
        String KategoriAdi;
        String Detay;
        public Beverages(String adi, double birimAgirligi, double birimFiyati, int stokMiktari,String kategoriAdi, String detay) {
            Adi = adi;
            BirimAgirligi = birimAgirligi;
            BirimFiyati = birimFiyati;
            StokMiktari = stokMiktari;
            KategoriAdi = kategoriAdi;
            Detay = detay;
        }
        public static void IcecekUrunuEkle(String Adi, double BirimAgirligi, double BirimFiyati, int StokMiktari,String kategoriAdi, String detay) {
            Beverages yeniUrun = new Beverages(Adi, BirimAgirligi, BirimFiyati, StokMiktari,kategoriAdi,detay);
            beveragesList.add(yeniUrun);
            System.out.println("Yeni içecek ürünü eklendi. Adı: " + Adi);
        }
    }
    static class Condiments {
        String KategoriAdi;
        String Detay;
        public Condiments(String adi, double birimAgirligi, double birimFiyati, int stokMiktari,String kategoriAdi, String detay) {
            Adi = adi;
            BirimAgirligi = birimAgirligi;
            BirimFiyati = birimFiyati;
            StokMiktari = stokMiktari;
            KategoriAdi = kategoriAdi;
            Detay = detay;
        }
        public void CesniBirimFiyatGuncelle(double yeniFiyat) {
            BirimFiyati = yeniFiyat;
            System.out.println("Çeşni birim fiyatı güncellendi. Yeni birim fiyat: " + BirimFiyati);
        }
    }
    static class Confections  {
        String KategoriAdi;
        String Detay;
        public Confections(String adi, double birimAgirligi, double birimFiyati, int stokMiktari,String kategoriAdi, String detay) {
            Adi = adi;
            BirimAgirligi = birimAgirligi;
            BirimFiyati = birimFiyati;
            StokMiktari = stokMiktari;
            KategoriAdi = kategoriAdi;
            Detay = detay;
        }
        public void SekerlemeDetaySil() {
            String[] detaylar = Detay.split(",");
            if (detaylar.length > 0) {
                String silinecekDetay = detaylar[detaylar.length - 1];
                Detay = Detay.replace("," + silinecekDetay, "");
                System.out.println("Sekerleme detayı silindi. Yeni detay: " + Detay);
            }
        }
    }
    static class DairyProducts  {
        String KategoriAdi;
        String Detay;
        public DairyProducts(String adi, double birimAgirligi, double birimFiyati, int stokMiktari,String kategoriAdi, String detay) {
            Adi = adi;
            BirimAgirligi = birimAgirligi;
            BirimFiyati = birimFiyati;
            StokMiktari = stokMiktari;
            KategoriAdi = kategoriAdi;
            Detay = detay;
        }
        public void SutUrunuSil() {
            if (BirimFiyati > 5.0) {
                dairyProductsList.remove(this);
                System.out.println("Süt ürünü silindi. Adı: " + Adi);
            } else {
                System.out.println("Ortalama birim fiyatı 5.0'dan düşük olduğu için silinemedi.");
            }
        }
    }
    static class Cereals{
        String KategoriAdi;
        String Detay;
        public Cereals(String adi, double birimAgirligi, double birimFiyati, int stokMiktari,String kategoriAdi, String detay) {
            Adi = adi;
            BirimAgirligi = birimAgirligi;
            BirimFiyati = birimFiyati;
            StokMiktari = stokMiktari;
            KategoriAdi = kategoriAdi;
            Detay = detay;
        }
        public void TahılMinStokEkle(int miktar) {
          /*  int minStok = cerealsList.stream().mapToInt(ce -> ce.S).min().orElse(0);
            StokMiktari += miktar;
            System.out.println("Tahıl min stok eklendi. Yeni stok miktarı: " + StokMiktari);*/
        }
    }
}

class VeriGirisiIslemleri {
    static class ListeOlusturma {
        public static void ListeleriOlustur() {
        }
    }
    static class DosyaOkuma {
        public static void DosyayiOku(String dosyaAdi) {
        }
    }
    static class DosyaYazma {
        public static void DosyayaYaz(String dosyaAdi) {
        }
    }
}


