public interface IUrun {
    void UrunStokGuncelle(int adet, boolean GirisMi);
    void UrunFiyatGuncelle(boolean indirimMi);
    void UrunBirimAgirlikGüncelle(int X);
    void YeniUrunEkle(String Ad,String BirimAgirligi, double BirimFiyatı, String detay);

}
