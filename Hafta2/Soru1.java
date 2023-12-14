import java.util.Scanner;
public class Soru1 {
    //1. x,y şeklinde koordinatları verilen bir üçgenin alanını aşağıdaki denkleme göre hesaplayınız.
    //Alan(ABC)=1/2 |x1.y2+x2.y3+x3.y1−(y1.x2+y2.x3+y3.x1)|
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin 3 köşe noktasının koordinatlarını girin:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("y3: ");
        double y3 = scanner.nextDouble();
       // double alan=((1/2)*((x1*y2)+(x2*y3)+(x3*y1))-((y1*x2)+(y2*x3)+(y3*x1)));
        alan(x1,y1,x2,y2,x3,y3);
    }
    static int alan(double x1,double y1,double x2,double y2,double x3,double y3){
        double alan = Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2.0);
        System.out.println(alan);
        return 0;
    }
}
