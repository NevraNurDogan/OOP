package Paket2;

import java.util.ArrayList;
import java.util.List;

public class DairyProducts_2258 extends Urun_2258 {
    public static List<DairyProducts_2258> dairyProductsList = new ArrayList<>();
    public DairyProducts_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
        dairyProductsList.add(this);
    }
    protected static void SutUrunuSil(List<DairyProducts_2258> dairyProductsList) {
        double top=0;
        int a=0;
        for (DairyProducts_2258 b : dairyProductsList){
            top+=b.BirimFiyati;
            a++;
        }
        double ort=top/a;
        for (DairyProducts_2258 b : dairyProductsList){
           if(ort<b.BirimFiyati){
               dairyProductsList.remove(b);
               System.out.println("Ortalama birim fiyatın üzerindeki ilk süt ürünü silindi");
               break;
           }
        }
        for (DairyProducts_2258 b : dairyProductsList) {
            System.out.print( b.adi+"\t");
            System.out.print( b.KategoriIndex+"\t");
            System.out.print(b.BirimAgirligi+"\t");
            System.out.print(b.BirimFiyati+"\t");
            System.out.print(b.StokMiktari+"\t");
            System.out.println();
        }

    }
}
