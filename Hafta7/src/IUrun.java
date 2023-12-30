public interface IUrun {
    void UrunStokGuncelle(int adet, boolean GirisMi);
    void UrunFiyatGuncelle(boolean indirimMi);
    void UrunBirimAgirlikGuncelle(int X);
    void YeniUrunEkle(String Adi, double BirimAgirligi, double BirimFiyati, String Detay);
}

