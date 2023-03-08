public class kefilKontrol extends Kredi{
    @Override
    public void kontrol2(Musteri musteri) {
        if (musteri.isKefil()){

        }else {
            setDeger(false);
        }
    }

//    @Override
//    public void kontrol(Musteri musteri) {
//        if (musteri.isKefil()){
//            System.out.println(deger);
//            super.execute(musteri);
//        }else {
//            setDeger(false);
//            System.out.println(deger);
//        }
//    }
}
