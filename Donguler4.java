import java.util.Scanner;
public class Donguler4 {
    //4.Girilen sayıdan küçük en büyük 3. Asal sayıyı bulunuz. Örnek : 25 => 23 , 19, 17 , Sonuc: 17
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int sayi = scanner.nextInt();
        int n = 3;
        int i = sayi - 1;
        while (n > 0 && i > 1) {
            if (asalMi(i)) {
                // System.out.println(i);
                n--;
                if(n==0){
                    System.out.println("Girilen sayidan kucuk en buyuk 3. asal sayi >>"+i);
                }
            }
            i--;
        }
    }
    static boolean asalMi(int sayi){
        if(sayi<=1){
            return false;
        }
        for(int i=2;i<sayi/2;i++){
            if(sayi%i==0){
                return false;
            }
        }
        return true;
    }
}
