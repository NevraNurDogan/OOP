import java.util.Scanner;
public class Donguler7 {
    /*7. Belirli bir tabanda rakamları toplamına tam bölünen sayılara Harshad sayısı denir. Girilen sayının
Harshad sayı olup olmadığını bulunuz.
Örnek: 162 => 162 / (1+6+2) = 18 olduğundan girilen  sayı Harshad sayısıdır. */
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi=scanner.nextInt();
        if (harshadMi(sayi)) {
            System.out.println(sayi + " Harshad sayidir.");
        } else {
            System.out.println(sayi + " Harshad sayisi degildir.");
        }


    }
    static int toplam(int sayi){
        int top=0;
        while(sayi>0){
            top+=sayi%10;
            sayi/=10;

        }
        return top;
    }

    static boolean harshadMi(int sayi){
        int toplamDeger = toplam(sayi);
        return sayi % toplamDeger == 0;
    }
}
