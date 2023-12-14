import java.util.Scanner;
public class Soru6 {
    // Bir metnin palindrom olup/olmadığını kontrol ediniz. Örnek: “adanada” kelimesi baştan ve sondan
    //aynı şekilde okunur.
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Bir kelime veya metin girin: ");
                String metin = scanner.nextLine();
                if (isPalindrom(metin)) {
                    System.out.println(metin + " bir palindromdur.");
                } else {
                    System.out.println(metin + " bir palindrom değildir.");
                }
            }
            public static boolean isPalindrom(String metin) {
                int uzunluk = metin.length();
                for (int i = 0; i < uzunluk / 2; i++) {
                    if (metin.charAt(i) != metin.charAt(uzunluk - i - 1)) {
                        return false;
                    }
                }
                return true;
            }

    }

