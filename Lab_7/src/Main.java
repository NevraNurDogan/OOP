import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String dosyaAdi = "C:\\Users\\Casper\\OneDrive\\Masaüstü\\Belgeler\\Yazılım Mühendisliği 2. Sınıf\\OOP\\6.Hafta\\Urunler.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaAdi));
            String satir;
            while ((satir = bufferedReader.readLine()) != null) {
                String[] veri = satir.split("\t");
                if (veri.length == 5) {
                    String ad = veri[0];
                    int kategoriIndex = Integer.parseInt(veri[1]);
                    String birimAgirligi = veri[2];
                    double birimFiyat = Double.parseDouble(veri[3]);
                    int stokMiktari = Integer.parseInt(veri[4]);
                    if (kategoriIndex == 1) {
                        Urun beverages = new Beverages(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 1, "Beverages", "detay");
                        Urun.beveragesList.add((Beverages) beverages);
                    }
                    if (kategoriIndex == 2) {
                        Urun condiments = new Condiments(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 2, "Condiments", "detay");
                        Urun.condimentsList.add((Condiments) condiments);
                    }
                    if (kategoriIndex == 3) {
                        Urun confections = new Confections(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 3,"Confections","detay");
                        Urun.confectionsList.add((Confections) confections);
                    }
                    if (kategoriIndex == 4) {
                        Urun dairyProducts = new DairyProducts(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 4, "dairyProducts", "");
                        Urun.dairyProductsList.add((DairyProducts) dairyProducts);
                    }
                    if (kategoriIndex == 5) {
                        Urun cereals = new Cereals(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 5, "cereals", "");
                        Urun.cerealsList.add((Cereals) cereals);
                    }

                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Urun.allProducts.addAll(Urun.beveragesList);
        Urun.allProducts.addAll(Urun.cerealsList);
        Urun.allProducts.addAll(Urun.condimentsList);
        Urun.allProducts.addAll(Urun.confectionsList);
        Urun.allProducts.addAll(Urun.dairyProductsList);

    }}