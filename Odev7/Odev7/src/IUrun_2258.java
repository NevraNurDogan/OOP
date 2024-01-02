import java.util.List;

public interface IUrun_2258 {
     void UrunStokGuncelle( List<? extends Urun_2258> selectedClass, int index,int adet, boolean GirisMi);
    void  UrunIsimGuncelle( List<? extends Urun_2258> selectedClass, int index,String yeniIsim, String yeniDetay);
    void UrunSil(List<? extends Urun_2258> selectedClass, int index);
    void YeniUrunEkle( List<? extends Urun_2258> selectedClass,String Adi, double BirimAgirligi, double BirimFiyati, String Detay);
}
