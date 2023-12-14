import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni girin: ");
        String metin = scanner.nextLine();
        Map<Character, Integer> harfSayilari = new HashMap<>();

        for (int i = 0; i < metin.length(); i++) {
            char harf = metin.charAt(i);
            if (Character.isLetter(harf)) {
                harf = Character.toLowerCase(harf);
                harfSayilari.put(harf, harfSayilari.getOrDefault(harf, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : harfSayilari.entrySet()) {
            char harf = entry.getKey();
            int sayi = entry.getValue();
            System.out.println("'" + harf + "': " + sayi + " kez");
        }
    }
}
