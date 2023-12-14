/*import java.util.Scanner;
public class Donguler2 {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Ikilik tabandan onluk tabana cevrilecek sayiyi giriniz:");
            int num=scanner.nextInt();
            System.out.println("Sonuc: " +ikilikTabana(num) );

            System.out.println("Onluk tabandan ikilik tabana cevrilecek sayiyi giriniz:");
            int num1=scanner.nextInt();
            System.out.println("Sonuc: " + onlukTabana(num1));

        }
        static String ikilikTabana(int sayi) {
            if (sayi == 0) {
                return "0";
            }
            StringBuilder binary = new StringBuilder();
            int deger;
            while(sayi>0) {
                deger=sayi%2;
                binary.insert(0, deger);
                sayi=sayi/2;

            }
            return binary.toString();

        }
        static String onlukTabana(int sayi) {
            int decimalNumber = 0;
            int power = 0;

            int i;
            for (i = sayi.length() - 1; i >= 0; i--) {
                int digit = sayi.charAt(i) - '0';
                decimalNumber += digit * Math.pow(2, power);
                power++;
            }

            return sayi;
        }

    }
*/