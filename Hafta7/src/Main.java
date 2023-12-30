import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
                        Urun beverages = new Beverages(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 1, "beverages", "");
                        Urun.beveragesList.add((Beverages) beverages);
                    }
                    if (kategoriIndex == 2) {
                        Urun condiments = new Condiments(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 2, "condiments", "");
                        Urun.condimentsList.add((Condiments) condiments);
                    }
                    if (kategoriIndex == 3) {
                        Urun confections = new Confections(ad, kategoriIndex, birimAgirligi, birimFiyat, stokMiktari, 3, "confections", "");
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
        for (Urun b : Urun.allProducts) {
            System.out.print(b.Adi + "\t");
            System.out.print(b.KategoriIndex + "\t");
            System.out.print(b.BirimAgirligi + "\t");
            System.out.print(b.BirimFiyati + "\t");
            System.out.print(b.StokMiktar + "\t");
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        int seciliSınıfIndex;
        do {
            System.out.println("Lütfen bir sınıf seçin:");
            System.out.println("1. Beverages");
            System.out.println("2. Condiments");
            System.out.println("3. Confections");
            System.out.println("4. DairyProducts");
            System.out.println("5. Cereals");
            System.out.println("0. Çıkış");

            System.out.print("Seçiminiz: ");
            seciliSınıfIndex = scanner.nextInt();

            if (seciliSınıfIndex > 0 && seciliSınıfIndex <= Urun.allProducts.size()) {
                // Seçilen sınıf üzerinde işlemleri gerçekleştir
                Urun seciliUrun = Urun.allProducts.get(seciliSınıfIndex - 1);
                SınıfIslemleri(seciliUrun);
            } else if (seciliSınıfIndex != 0) {
                System.out.println("Geçersiz sınıf seçimi. Lütfen tekrar deneyin.");
            }

        } while (seciliSınıfIndex != 0);

        System.out.println("Programdan çıkılıyor.");
    }

    public static void SınıfIslemleri(Urun urun) {
        Scanner scanner = new Scanner(System.in);
        int secim;
        do {
            System.out.println("1. Urun Stok Guncelle");
            System.out.println("2. Urun Fiyat Guncelle");
            System.out.println("3. Urun Birim Agirlik Guncelle");
            System.out.println("4. Yeni Urun Ekle");
            System.out.println("5. En Kisa Isimli Urun Isim Guncelle");
            System.out.println("6. Stok En Cok Olan Urun Sil");
            System.out.println("7. En Pahali Urun Fiyat Guncelle");
            System.out.println("8. Detay Guncelle");
            System.out.println("0. Sınıf İşlemlerinden Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Adet: ");
                    int adet = scanner.nextInt();
                    System.out.print("Giriş mi? (true/false): ");
                    boolean girisMi = scanner.nextBoolean();
                    urun.UrunStokGuncelle(adet, girisMi);
                    break;
                case 2:
                    System.out.print("İndirim mi? (true/false): ");
                    boolean indirimMi = scanner.nextBoolean();
                    urun.UrunFiyatGuncelle(indirimMi);
                    break;
                case 3:
                    System.out.print("Yüzde kaç kadar ağırlık eklensin: ");
                    int yuzde = scanner.nextInt();
                    urun.UrunBirimAgirlikGuncelle(yuzde);
                    break;
                case 4:
                    System.out.print("Adı: ");
                    String adi = scanner.next();
                    System.out.print("Birim Ağırlığı: ");
                    double birimAgirligi = scanner.nextDouble();
                    System.out.print("Birim Fiyatı: ");
                    double birimFiyati = scanner.nextDouble();
                    System.out.print("Detay: ");
                    String detay = scanner.next();
                    urun.YeniUrunEkle(adi, birimAgirligi, birimFiyati, detay);
                    break;
                case 5:
                    System.out.print("Yeni İsim: ");
                    String yeniIsim = scanner.next();
                    System.out.print("Yeni Detay: ");
                    String yeniDetay = scanner.next();
                    urun.EnKisaIsimliUrunIsimGuncelle(yeniIsim, yeniDetay);
                    break;
                case 6:
                    urun.StokEnCokOlanUrunSil();
                    break;
                case 7:
                    urun.EnPahaliUrunFiyatGuncelle();
                    break;
                case 8:
                    urun.DetayGuncelle();
                    break;
                case 0:
                    System.out.println("Sınıf işlemlerinden çıkılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }
    }
}
