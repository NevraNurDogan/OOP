import java.util.Scanner;
public class Donguler5 {
    /*5. * işareti kullanarak kare, dikdörtgen, eşkenar ve dik üçgen elde ediniz. */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Oluşturacağınız karenin birim sayısını giriniz:");
        int a= scanner.nextInt();
        kare(a);

        System.out.print("Oluşturacağınız dikdörtgenin en ve boy birim sayılarını giriniz:");
        int en= scanner.nextInt();
        int boy= scanner.nextInt();
        dikdortgen(en,boy);

        System.out.print("Oluşturacağınız dik uckenin birim sayısını giriniz:");
        int c= scanner.nextInt();
       dikUcgen(c);


        System.out.print("Oluşturacağınız eskenar uckenin birim sayısını giriniz:");
        int d= scanner.nextInt();
        eskenarUcgen(d);
        tersEskenarUcgen(d);


    }
    static void kare(int birim){
        for(int i=0;i<birim;i++){
            for(int j=0;j<birim;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }

    static void dikdortgen(int en ,int boy){
        for(int i=0;i<boy;i++){
            for(int j=0;j<en;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }

    static void dikUcgen(int birim) {
        for (int i = 1; i <= birim; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
    }


    static void eskenarUcgen(int birim) {
        for (int i = 1; i <= birim; i++) {
            // Boşlukları ekle
            for (int j = birim - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Yıldızları ekle
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*
         *
         ***
         *****
         *******
         *********
         */
    }


    static void tersEskenarUcgen(int birim) {
        System.out.println();
        for (int i = birim; i >= 1; i--) {
            // Boşlukları ekle
            for (int j = 0; j < birim - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekle
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
  /*  static void dikUcgen(int birim){
        for(int i=0;i<birim;i++){
            for(int j=0;j<birim-i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
*	*	*	*	*
*	*	*	*
*	*	*
*	*
*
    }
   */
  /*static void dikUcgen(int birim) {
      for (int i = 0; i < birim; i++) {
          for (int j = 0; j <i; j++) {
              System.out.print("\t");
          }
          for (int k = 0; k < birim - i; k++) {
              System.out.print("*\t");
          }
          System.out.println();
      }
  }
  *	*	*	*	*
	*	*	*	*
		*	*	*
			*	*
				*
*/


}
