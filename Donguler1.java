import java.util.Scanner;
public class main {
/*1. Döngü kullanarak bir fibonacci fonksiyonu (Fib_Hesapla(int sira)) yazınız ve istenilen sıradaki elemanı 
ekrana yazdırınız. 
Fibonacci Dizisi: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144   Fib_Hesapla(8)=21*/
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Gormek istediginiz elemanin sirasini yaziniz:");
		int num=scanner.nextInt();
		Fib_Hesapla(num);
		
		

	}
	static void Fib_Hesapla(int sira) {
		int a=1, b=1,c=0;
		for(int i=2;i<sira;i++) {
			 c=a+b;
	         a=b;
	         b=c;
		}
		System.out.println(sira+". siradaki eleman "+c);
		
		
		
	}

}
