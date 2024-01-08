package Odev8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Odev8.Urun_2258.Beverages;
import Odev8.Urun_2258.Cereals;
import Odev8.Urun_2258.Condiments;
import Odev8.Urun_2258.Confections;
import Odev8.Urun_2258.DairyProducts;

public class DosyaIslemleri_2258 {
    static List<Urun_2258> allProducts = new ArrayList<>();
    public static class DosyaOkuma {
        static void ListeOlustur() {
            String fileName = "C:\\Users\\Casper\\OneDrive\\Masaüstü\\Belgeler\\Yazılım Mühendisliği 2. Sınıf\\OOP\\8.Hafta\\Urunler.txt";

            try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
                br.readLine();
                String line = br.readLine();

                while (line != null) {
                    String[] cols = line.split("\\t");

                    int kategoriIndex = Integer.parseInt(cols[1]);

                    if (kategoriIndex == 1)
                        Urun_2258.Beverages.list.add(new Urun_2258.Beverages(cols[0], Integer.parseInt(cols[1]), cols[2],
                                Double.parseDouble(cols[3]), Double.parseDouble(cols[4])));
                    if (kategoriIndex == 2)
                        Urun_2258.Condiments.list.add(new Urun_2258.Condiments(cols[0], Integer.parseInt(cols[1]), cols[2],
                                Double.parseDouble(cols[3]), Double.parseDouble(cols[4])));
                    if (kategoriIndex == 3)
                        Urun_2258.Confections.list.add(new Urun_2258.Confections(cols[0], Integer.parseInt(cols[1]), cols[2],
                                Double.parseDouble(cols[3]), Double.parseDouble(cols[4])));
                    if (kategoriIndex == 4)
                        Urun_2258.DairyProducts.list.add(new Urun_2258.DairyProducts(cols[0], Integer.parseInt(cols[1]), cols[2],
                                Double.parseDouble(cols[3]), Double.parseDouble(cols[4])));
                    if (kategoriIndex == 5)
                        Urun_2258.Cereals.list.add(new Urun_2258.Cereals(cols[0], Integer.parseInt(cols[1]), cols[2],
                                Double.parseDouble(cols[3]), Double.parseDouble(cols[4])));

                    line = br.readLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            for (Urun_2258 urun : Beverages.list) {
                System.out.println(urun.adi + "\t" + urun.kategoriIndex +
                        "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari);
            }
            for (Urun_2258 urun : Condiments.list) {
                System.out.println(urun.adi + "\t" + urun.kategoriIndex +
                        "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari);
            }
            for (Urun_2258 urun : Confections.list) {
                System.out.println(urun.adi + "\t" + urun.kategoriIndex +
                        "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari);
            }
            for (Urun_2258 urun : DairyProducts.list) {
                System.out.println(urun.adi + "\t" + urun.kategoriIndex +
                        "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari);
            }
            for (Urun_2258 urun : Cereals.list) {
                System.out.println(urun.adi + "\t" + urun.kategoriIndex +
                        "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari);
            }
        }
    }


    public static class DosyaYazma {
        static void ListeyiYaz() {
            try (BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\Casper\\OneDrive\\Masaüstü\\Belgeler\\Yazılım Mühendisliği 2. Sınıf\\OOP\\8.Hafta\\Urunler.txt"));) {

                for (int i = 0; i < Beverages.list.size(); i++) {
                    Urun_2258 urun = Beverages.list.get(i);
                    bw.write(urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati + "\t"
                            + urun.stokMiktari);
                    bw.newLine();
                }
                for (int i = 0; i < Condiments.list.size(); i++) {
                    Urun_2258 urun = Condiments.list.get(i);
                    bw.write(urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati + "\t"
                            + urun.stokMiktari);
                    bw.newLine();
                }
                for (int i = 0; i < Confections.list.size(); i++) {
                    Urun_2258 urun = Confections.list.get(i);
                    bw.write(urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati + "\t"
                            + urun.stokMiktari);
                    bw.newLine();
                }
                for (int i = 0; i < DairyProducts.list.size(); i++) {
                    Urun_2258 urun = DairyProducts.list.get(i);
                    bw.write(urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati + "\t"
                            + urun.stokMiktari);
                    bw.newLine();
                }
                for (int i = 0; i < Cereals.list.size(); i++) {
                    Urun_2258 urun = Cereals.list.get(i);
                    bw.write(urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati + "\t"
                            + urun.stokMiktari);
                    bw.newLine();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
