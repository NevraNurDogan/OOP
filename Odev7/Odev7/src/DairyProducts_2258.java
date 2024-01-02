import java.util.List;

public class DairyProducts_2258 extends Urun_2258 {
    public DairyProducts_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktar, int katsayi, String kategoriAdi, String detay) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktar, katsayi, kategoriAdi, detay);
    }

    @Override
    void UrunFiyatGuncelle(List<? extends Urun_2258> selectedClass, int index, int oran, boolean indirimMi) {
        if (index >= 0 && index < selectedClass.size()) {
            Urun_2258 urun = selectedClass.get(index);
            double katsayi = 1.0;
            if (indirimMi) {
                katsayi -= oran / 100.0;
                System.out.println(urun.Adi + " ürününe %" + oran + " indirim uygulandı.");
            } else {
                katsayi += oran / 100.0;
                System.out.println(urun.Adi + " ürününe %" + oran + " zam uygulandı.");
            }
            urun.BirimFiyati *= katsayi;
            System.out.println("Yeni birim fiyatı: " + urun.BirimFiyati);
        } else {
            System.out.println("Geçersiz indeks! Lütfen geçerli bir indeks girin.");
        }
    }

    @Override
    public void UrunKategorikZamYap(List<? extends Urun_2258> selectedClass,int index, int X) {
        if (index >= 0 && index < selectedClass.size()) {
            Urun_2258 b = selectedClass.get(index);
            b.BirimFiyati *= (1 + X / 100.0);
            System.out.println(b.Adi + " ürününe %" + X + " oranında zam yapıldı. Yeni birim fiyat: " + b.BirimFiyati);
        }
    }
}

