import java.util.List;
public class Cereals_2258 extends Urun_2258 {
    public Cereals_2258(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        super(adi, kategoriIndex,birimAgirligi, birimFiyati, stokMiktari);
    }
    static void TahilUrunEkle(String adi, String birimAgirligi, double birimFiyati, int stokMiktari, List<Cereals_2258> cereals2258List) {
        Cereals_2258 yeniTahilUrunu = new Cereals_2258(adi, 5, birimAgirligi, birimFiyati, stokMiktari);
        cereals2258List.add(yeniTahilUrunu);
        System.out.println("Yeni tahıl ürünü eklendi: " + yeniTahilUrunu.getAdi());
        System.out.println("Güncellenmiş tahıl ürünleri listesi:");
        for (Cereals_2258 tahilUrunu : cereals2258List) {
            System.out.println( tahilUrunu.getAdi() +
                    "\t" + tahilUrunu.getKategoriIndex() +
                    "\t" + tahilUrunu.getBirimAgirligi() +
                    "\t" + tahilUrunu.getBirimFiyati() +
                    "\t" + tahilUrunu.getStokMiktari());
        }
    }
}
