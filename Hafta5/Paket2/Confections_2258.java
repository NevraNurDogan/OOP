package Paket2;

import java.util.ArrayList;
import java.util.List;

public class Confections_2258 extends Urun_2258 {
    private String detay;
    public static List<Confections_2258> confectionsList = new ArrayList<>();

    public Confections_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari, String detay) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        this.detay = detay;
        confectionsList.add(this);
    }
    public Confections_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);

    }
    protected void sekerlemeDetayEkle(String adi, String yeniDetay) {
        if (this.adi.equals(adi)) {
            this.detay += yeniDetay;
            System.out.println("Detay başarıyla eklendi: " + yeniDetay);
        } else {
            System.out.println("Ürün bulunamadı.");
        }
    }

    protected String getDetay() {
        return detay;
    }

    protected void setDetay(String detay) {
        this.detay = detay;
    }
}
