import java.util.Scanner;
public class Donguler8 {
   /* 8. n pozitif sayı olmak üzere,  Fn= 2^(2^n) + 1 biçiminde ifade edilebilen sayılara Fermat sayısı denir. n.
    sıradaki  Fermat Sayıyı bulan fonksiyonu yazınız.
    F0= 2^1 + 1 = 3
    F1= 2^2 + 1 = 5
    F2= 2^4 + 1 = 17*/
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pozitif tam sayi olan bir n sayisi giriniz:");
        int n= scanner.nextInt();
        fermant(n);

    }
    static void fermant(int n){
        int a=1,b=1;
        for(int i=0;i<n;i++){
            a*=2;
        }
        for(int i=0;i<a;i++){
            b*=2;
        }
        System.out.println("Sonuc:"+(b+1));
    }
}
