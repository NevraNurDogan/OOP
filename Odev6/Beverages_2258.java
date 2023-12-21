import java.util.ArrayList;
import java.util.List;

public class Beverages_2258 extends Urun_2258 {
    private static List<Beverages_2258> beverages2258List = new ArrayList<>();
    public Beverages_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        beverages2258List.add(this);
    }
    static void IcecekStoklariniGuncelle(int miktar){
        for (Beverages_2258 b : beverages2258List) {
            b.StokMiktari= b.StokMiktari+miktar;
            if(b.StokMiktari<0){
                b.StokMiktari= Integer.parseInt(null);
            }
            else{
                b.StokMiktari= b.StokMiktari;
            }
        }
    }
}
