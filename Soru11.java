import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Soru11 {
    //11. Girilen 10 adet stringden oluşan listede, içinde “yaz” geçen fakat ‘b’ içermeyen elemanları gösteriniz.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> stringList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                System.out.print("Bir string girin: ");
                String metin = scanner.nextLine();
                stringList.add(metin);
            }

            System.out.println("\"yaz\" içeren ve 'b' içermeyen elemanlar:");
            for (String metin : stringList) {
                if (metin.contains("yaz") && !metin.contains("b")) {
                    System.out.println(metin);
                }
            }
        }
    }


