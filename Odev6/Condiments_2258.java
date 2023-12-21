import java.util.ArrayList;
import java.util.List;

public class Condiments_2258 extends Urun_2258 {
    private static List<Condiments_2258> condiments2258List = new ArrayList<>();
    public Condiments_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
    }
    static void CesniBirimAgirlikGuncelle(List<Condiments_2258> condiments2258List, int N, String yeniAgirlik){
        if (N >= 1 && N <= condiments2258List.size()) {
            Condiments_2258 cesni = condiments2258List.get(N - 1); // N. sıradaki çeşni nesnesini al
            cesni.BirimAgirligi = yeniAgirlik;
            System.out.println("Ağırlık güncellendi: " + cesni.BirimAgirligi);
        } else {
            System.out.println("Geçersiz indis.");
        }
    }
}
