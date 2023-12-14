import java.util.ArrayList;
import java.util.List;
public class Soru10 {
        public static void main(String[] args) {
            List<String> isimListesi = new ArrayList<>();
            isimListesi.add("Ahmet");
            isimListesi.add("Ali");
            isimListesi.add("Veli");
            isimListesi.add("Sami");
            isimListesi.add("Cemal");
            isimListesi.add("Hasan");
            isimListesi.add("Emre");
            isimListesi.add("Osman");
            isimListesi.add("Mahmut");
            isimListesi.add("Mehmet");

            System.out.println("Orta karakteri 'm' olan isimler:");
            for (String isim : isimListesi) {
                if (hasMiddleCharacterM(isim)) {
                    System.out.println(isim);
                }
            }
        }
        public static boolean hasMiddleCharacterM(String isim) {
            int uzunluk = isim.length();
            if (uzunluk % 2 == 0) {
                return false;
            }
            int ortaIndex = uzunluk / 2;
            return isim.charAt(ortaIndex) == 'm' || isim.charAt(ortaIndex) == 'M';
        }
    }


