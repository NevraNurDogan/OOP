import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Urun {
    String Adi;
    int KategoriIndex;
    String BirimAgirligi;
    double BirimFiyati;
    int StokMiktari;

    public Urun(String Adi, int KategoriIndex, String BirimAgirligi, double BirimFiyati, int StokMiktari) {
        this.Adi = Adi;
        this.KategoriIndex = KategoriIndex;
        this.BirimAgirligi = BirimAgirligi;
        this.BirimFiyati = BirimFiyati;
        this.StokMiktari = StokMiktari;
    }
    public void UrunStokGuncelle(String UrunAdi, boolean SatisMi, int adet) {
        if (SatisMi) {
            if (StokMiktari >= adet) {
                StokMiktari -= adet;
                System.out.println(UrunAdi + " adlı üründen " + adet + " adet satıldı.");
            } else {
                System.out.println("Stok yetersiz!");
            }
        } else {
            StokMiktari += adet;
            System.out.println(UrunAdi + " adlı ürüne " + adet + " adet stok eklendi.");
        }
    }

    public void UrunAdiDegistir(String yeniAdi) {
        this.Adi = yeniAdi;
        System.out.println("Ürün adı değiştirildi: Yeni adı -> " + yeniAdi);

    }
    public static double OrtalamaBirimFiyatHesapla(ArrayList<Urun> urunListesi) {
        if (urunListesi.isEmpty()) {
            return 0.0;
        }
        double toplamFiyat = 0.0;
        int toplamAdet = 0;

        for (Urun urun : urunListesi) {
            toplamFiyat += urun.BirimFiyati * urun.StokMiktari;
            toplamAdet += urun.StokMiktari;
        }

        return toplamFiyat / toplamAdet;
    }
    public static void listeOlustur(ArrayList<Urun> urunListesi,String dosyaAdi){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaAdi));
            String satir;
            while ((satir = bufferedReader.readLine()) != null) {
                String[] veri = satir.split("\t");
                if (veri.length == 5) {
                    String ad = veri[0];
                    int KategoriIndex = Integer.parseInt(veri[1]);
                    String birimAgirligi = veri[2];
                    double birimFiyat = Double.parseDouble(veri[3]);
                    int stokMiktari = Integer.parseInt(veri[4]);

                    Urun urun = new Urun(ad, KategoriIndex, birimAgirligi, birimFiyat, stokMiktari);
                    urunListesi.add(urun);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ürün Adı\tKategori Index\tBirim Ağırlığı\tBirim Fiyatı\tStok Miktarı");
        System.out.println("--------------------------------------------------------------------");
        for (Urun urun : urunListesi) {
            System.out.print( urun.Adi+"\t");
            System.out.print( urun.KategoriIndex+"\t");
            System.out.print( urun.BirimAgirligi+"\t");
            System.out.print(urun.BirimFiyati+"\t");
            System.out.print(urun.StokMiktari+"\t");
            System.out.println();

        }
    }
}