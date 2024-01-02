import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;

public class Main_2258 {
    private static int productIndex;
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
                        Urun_2258 beverages = new Beverages_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 1, "beverages", "");
                        Urun_2258.beveragesList.add((Beverages_2258) beverages);
                    }
                    if (kategoriIndex == 2) {
                        Urun_2258 condiments = new Condiments_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 2, "condiments", "");
                        Urun_2258.condimentsList.add((Condiments_2258) condiments);
                    }
                    if (kategoriIndex == 3) {
                        Urun_2258 confections = new Confections_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 3, "confections", "");
                        Urun_2258.confectionsList.add((Confections_2258) confections);
                    }
                    if (kategoriIndex == 4) {
                        Urun_2258 dairyProducts = new DairyProducts_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 4, "dairyProducts", "");
                        Urun_2258.dairyProductsList.add((DairyProducts_2258) dairyProducts);
                    }
                    if (kategoriIndex == 5) {
                        Urun_2258 cereals = new Cereals_2258(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 5, "cereals", "");
                        Urun_2258.cerealsList.add((Cereals_2258) cereals);
                    }

                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Urun_2258.allProducts.addAll(Urun_2258.beveragesList);
        Urun_2258.allProducts.addAll(Urun_2258.cerealsList);
        Urun_2258.allProducts.addAll(Urun_2258.condimentsList);
        Urun_2258.allProducts.addAll(Urun_2258.confectionsList);
        Urun_2258.allProducts.addAll(Urun_2258.dairyProductsList);
        for (Urun_2258 b : Urun_2258.allProducts) {
            System.out.print(b.Adi + "\t");
            System.out.print(b.KategoriIndex + "\t");
            System.out.print(b.BirimAgirligi + "\t");
            System.out.print(b.BirimFiyati + "\t");
            System.out.print(b.StokMiktar + "\t");
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        List<? extends Urun_2258> selectedClass = null;
        Urun_2258 selectedProduct = null;

        while (selectedClass == null) {
            System.out.println("1. Beverages");
            System.out.println("2. Condiments");
            System.out.println("3. Confections");
            System.out.println("4. DairyProducts");
            System.out.println("5. Cereals");
            System.out.println("0. Çıkış");

            System.out.print("Sınıf seçimi (1-2-3-4-5): ");
            int classChoice = scanner.nextInt();
            scanner.nextLine();

            switch (classChoice) {
                case 1:
                    selectedClass = Urun_2258.beveragesList;
                    break;
                case 2:
                    selectedClass = Urun_2258.condimentsList;
                    break;
                case 3:
                    selectedClass = Urun_2258.confectionsList;
                    break;
                case 4:
                    selectedClass = Urun_2258.dairyProductsList;
                    break;
                case 5:
                    selectedClass = Urun_2258.cerealsList;
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
        while (selectedProduct == null) {
            System.out.println("Ürün Seç:");
            System.out.print("Ürün seçimi: ");
            productIndex = scanner.nextInt();
            scanner.nextLine();
            if (productIndex >= 0 && productIndex < selectedClass.size()) {
                selectedProduct = selectedClass.get(productIndex);
            } else {
                System.out.println("Geçersiz ürün seçimi!");
            }
        }

        while (true) {
            System.out.println("1. UrunStokGuncelle");
            System.out.println("2. UrunIsimGuncelle");
            System.out.println("3. UrunSil");
            System.out.println("4. YeniUrunEkle");
            System.out.println("5. UrunFiyatGuncelle");
            System.out.println("6. UrunKategorikZamYap");
            System.out.println("7. Çıkış");
            System.out.print("İşlem seçimi (1-7): ");
            int operationChoice = scanner.nextInt();
            scanner.nextLine();

            switch (operationChoice) {
                case 1:
                    System.out.print("Adet: ");
                    int adet = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Giriş yapılacaksa true, çıkış yapılacaksa false: ");
                    boolean GirisMi = scanner.nextBoolean();
                    scanner.nextLine();
                    selectedProduct.UrunStokGuncelle(selectedClass,productIndex,adet, GirisMi);
                    break;
                case 2:
                    System.out.print("Yeni İsim: ");
                    String yeniIsim = scanner.nextLine();
                    System.out.print("Yeni Detay: ");
                    String yeniDetay = scanner.nextLine();
                    selectedProduct.UrunIsimGuncelle(selectedClass, productIndex,yeniIsim, yeniDetay);
                    break;
                case 3:
                    selectedProduct.UrunSil(selectedClass, productIndex);
                    break;
                case 4:
                    // YeniUrunEkle işlemi
                    break;
                case 5:
                    System.out.print("Oran: ");
                    int oran = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("İndirim yapılacaksa true, zam yapılacaksa false: ");
                    boolean indirimMi = scanner.nextBoolean();
                    scanner.nextLine();
                    selectedProduct.UrunFiyatGuncelle(selectedClass, productIndex,oran, indirimMi);
                    break;
                case 6:
                    System.out.print("X değeri: ");
                    int X = scanner.nextInt();
                    scanner.nextLine();
                    selectedProduct.UrunKategorikZamYap(selectedClass, productIndex,X);
                    break;
                case 7:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}