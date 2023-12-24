import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class Beverages_2258 extends Urun_2258 {
    public static List<Beverages_2258> beverages2258List = new ArrayList<>();
    public Beverages_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        beverages2258List.add(this);
    }
    static void UrunFiyatGuncelle(int oran){
        double zamOrani = oran / 100.0;
        for (Beverages_2258 b : beverages2258List) {
            int stok=b.StokMiktari;
            if(stok<20){
                b.setBirimFiyati(b.getBirimFiyati() * (1 + (zamOrani/2)));
            }
            else if(stok >= 20 && stok <50){
                b.setBirimFiyati(b.getBirimFiyati() *  (1 + zamOrani));
            }
            else if(stok>50){
                b.setBirimFiyati(b.getBirimFiyati() * (1 + pow(zamOrani, 2)));


        }
    }



    }
}
