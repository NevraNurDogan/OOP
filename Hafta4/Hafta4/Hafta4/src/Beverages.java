import java.util.ArrayList;

public class Beverages extends Urun{
    static ArrayList<Urun> icecekListesi;
    public Beverages(String Adi, int KategoriIndex, String BirimAgirligi, double BirimFiyati, int StokMiktari) {
        super(Adi, KategoriIndex, String.valueOf(BirimAgirligi), BirimFiyati, StokMiktari);
        icecekListesi = new ArrayList<>();
    }
   void IcecekUrunuEkle(String Adi, String BirimAgirligi, double BirimFiyatı, int StokMiktari){
       Urun yeniIcecek = new Urun(Adi, this.KategoriIndex, BirimAgirligi, BirimFiyati, StokMiktari);
       icecekListesi.add(yeniIcecek);
       System.out.println("Yeni içecek eklendi: " + Adi);
   }
    }

