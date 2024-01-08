package Odev8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Urun_2258 {
    String adi;
    int kategoriIndex;
    String kategoriAdi;
    String detay;
    String birimAgirligi;
    double birimFiyati;
    double stokMiktari;

    Urun_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, double stokMiktari) {
        this.adi = adi;
        this.kategoriIndex = kategoriIndex;
        this.birimAgirligi = birimAgirligi;
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
    }

    static void UrunStokGuncelle(int kategoriAdi, boolean ekleMi) {
        ArrayList<? extends Urun_2258> urunListesi = null;

        switch (kategoriAdi) {
            case 1:
                urunListesi = Beverages.list;
                break;
            case 2:
                urunListesi = Condiments.list;
                break;
            case 3:
                urunListesi = Confections.list;
                break;
            case 4:
                urunListesi = DairyProducts.list;
                break;
            case 5:
                urunListesi = Cereals.list;
                break;
            default:
                return;
        }

        System.out.println("Stok güncellenecek ürünü giriniz:");
        Scanner scanner = new Scanner(System.in);
        String urunAdi = scanner.nextLine();
        for (Urun_2258 urun : urunListesi) {
            if (urun.adi.equals(urunAdi)) {
                System.out.print(urun.stokMiktari + " => ");
                urun.stokMiktari *= 1 + (ekleMi ? 0.5 : -0.5);
                System.out.println(urun.stokMiktari);
                break;
            }
        }
    }


    static void UrunKategorikIndirimYap(int kategori, int x) {
        ArrayList<? extends Urun_2258> urunListesi = null;

        switch (kategori) {
            case 1:
                urunListesi = Beverages.list;
                break;
            case 2:
                urunListesi = Condiments.list;
                break;
            case 3:
                urunListesi = Confections.list;
                break;
            case 4:
                urunListesi = DairyProducts.list;
                break;
            case 5:
                urunListesi = Cereals.list;
                break;
            default:
                return;
        }

        double toplam = 0;

        for (Urun_2258 urun : urunListesi) {
            toplam += urun.birimFiyati;
        }

        double ortalama = toplam / urunListesi.size();

        for (Urun_2258 urun : urunListesi) {
            if (urun.birimFiyati > ortalama) {
                System.out.print(urun.adi + "  " + urun.birimFiyati + "  ");
                urun.birimFiyati *= 1 - ((double) x / 100);
                System.out.println(urun.birimFiyati);
            }
        }
    }

    public static class Beverages extends Urun_2258 {
        Beverages(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, double stokMiktari) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
            this.kategoriAdi = "Beverages";
        }

        static ArrayList<Beverages> list = new ArrayList<>();

        static void IcecekUrunuSil(String isim) {
            List<Beverages> silinecekler = new ArrayList<>();
            for (Beverages current : list) {
                if (current.adi.equals(isim)) {
                    System.out.println(current.adi + " silindi.");
                    silinecekler.add(current);
                }
            }
            list.removeAll(silinecekler);
        }
    }

    public static class Condiments extends Urun_2258 {
        Condiments(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, double stokMiktari) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
            this.kategoriAdi = "Condiments";
        }

        static ArrayList<Condiments> list = new ArrayList<>();

        static void CesniUrunEkle(String adi, String birimAgirligi, double birimFiyati, double stokMiktari) {
            list.add(new Condiments(adi, 2, birimAgirligi, birimFiyati, stokMiktari));
            for (Urun_2258 urun : Condiments.list) {
                System.out.println(urun.adi + "\t" + urun.kategoriIndex +
                        "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari);
            }
        }
    }

    public static class Confections extends Urun_2258 {
        Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, double stokMiktari) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
            this.kategoriAdi = "Confections";
        }

        static ArrayList<Confections> list = new ArrayList<>();

        static void SekerlemeDetayEkle(String yeniDetay) {
            for (Urun_2258 urun : Confections.list) {
                urun.detay = yeniDetay;
            }
            System.out.println("Yeni detay eklendi.");
        }
    }

    public static class DairyProducts extends Urun_2258 {
        DairyProducts(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, double stokMiktari) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
            this.kategoriAdi = "DairyProducts";
        }

        static ArrayList<DairyProducts> list = new ArrayList<>();

        static void SutUrunuStokGuncelle(boolean satisMi, int miktar) {
            for (Urun_2258 urun : DairyProducts.list) {
                if (satisMi) {
                    urun.setStokMiktari(urun.getStokMiktari() - miktar);
                } else {
                    urun.setStokMiktari(urun.getStokMiktari() + miktar);
                }
            }
            for (Urun_2258 urun : DairyProducts.list) {
                System.out.println(urun.adi + "\t" + urun.kategoriIndex +
                        "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari);
            }
        }
    }
    public static class Cereals extends Urun_2258 {
        Cereals(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, double stokMiktari) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
            this.kategoriAdi = "Cereals";
        }

        static ArrayList<Cereals> list = new ArrayList<>();

        static void TahilBirimFiyatGuncelle(double yeniFiyat) {
            double minFark = Double.MAX_VALUE;
            Cereals enYakinTahil = null;

            double toplam = 0;
            for (Cereals tahil : list) {
                toplam += tahil.birimFiyati;
            }
            double ortalama = toplam / list.size();

            for (Cereals tahil : list) {
                double fark = Math.abs(tahil.birimFiyati - ortalama);
                if (fark < minFark) {
                    minFark = fark;
                    enYakinTahil = tahil;
                }
            }
            if (enYakinTahil != null) {
                System.out.print(enYakinTahil.adi + " => " + enYakinTahil.birimFiyati + " -> ");
                enYakinTahil.birimFiyati = yeniFiyat;
                System.out.println(enYakinTahil.birimFiyati);
            }
        }

    }
    public double getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(double stokMiktari) {
        this.stokMiktari = stokMiktari;
    }
}