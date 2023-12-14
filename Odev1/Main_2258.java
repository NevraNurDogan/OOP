import java.util.Scanner;

public class Main_2258 {

		public static void main(String[] args){
	        tumunuYazdir();
	    }
	    static boolean asalMi(int sayi){
	        if((sayi)<=1){
	            return false;
	        }
	        for(int i=2;i<(sayi)/2+1;i++){
	            if((sayi)%i==0){
	                return false;
	            }
	        }
	        return true;
	    }
	    static boolean asal2CarpaniVarMi(int sayi) {
	        for (int i = 2; i <= (sayi)/2; i++) {
	            if (asalMi(i) && (sayi)%i==0 && asalMi((sayi)/i)) {
	                return true;
	            }
	        }
	        return false;
	    }
	    static boolean sayiChenAsaliMi(int sayi){
	        if(asalMi(sayi) &&  (asalMi(sayi+2)==true || asal2CarpaniVarMi(sayi+2)) ){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	    static void tumunuYazdir(){
	        for(int i=10;i<100;i++){
	            if(sayiChenAsaliMi(i)){
	                System.out.println(i + "=> Chen Asali");
	            }
	        }
	    }

	}

