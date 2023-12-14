import java.util.Scanner;
public class Donguler6 {
    /*6. Girilen sayının asal çarpanlarını bir kez olmak üzere yazdırıp kaç tane olduğu olduğunu bulunuz.
Örnek : 150 : 2x3x52  Sonuc: 2, 3, 5 Sonuç 3 olacaktır.*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Sayi giriniz:");
        int sayi= scanner.nextInt();

      //  System.out.println(asalMi(sayi));
        carpanBul(sayi);
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
    static void carpanBul(int sayi){
        int sayac=0;
        for(int i=1;i<sayi/2;i++){
            if(sayi%i==0){
                if(asalMi(i)){
                    System.out.println(i);
                    sayac++;
                }
            }
        }
        System.out.println("Sonuc:"+sayac);
    }
}
