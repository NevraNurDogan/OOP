
import java.util.ArrayList;
public class Main {
    static ArrayList<Urun> urunListesi = new ArrayList<>();
    public static void main(String[] args) {

        Condiments cesni = new Condiments("Baharat", 2, String.valueOf(0.2), 3.0, 30, "Çeşniler", "Karışık baharat");
        cesni.CesniBirimFiyatGuncelle(2.5);

        Confections sekerleme = new Confections("Çikolata", 3, String.valueOf(0.1), 5.0, 25, "Şekerlemeler", "Bitter çikolata");
        sekerleme.SekerlemeDetaySil();

        DairyProducts sutUrunu = new DairyProducts("Süt", 4, String.valueOf(1.0), 2.5, 50, "Süt Ürünleri", "İnek sütü");
        sutUrunu.SutUrunuSil();

        Cereals tahilUrunu = new Cereals("Buğday", 5, String.valueOf(0.8), 1.5, 20, "Tahıllar", "Organik buğday");
        tahilUrunu.TahılMinStokEkle(10);
        Urun.listeOlustur(urunListesi, "C:\\Users\\Casper\\OneDrive\\Masaüstü\\Belgeler\\Yazılım Mühendisliği 2. Sınıf\\OOP\\3.Hafta\\Urun.txt");
    }
}