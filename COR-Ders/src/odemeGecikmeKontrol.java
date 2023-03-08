public class odemeGecikmeKontrol extends Kredi{
    @Override
    public void kontrol2(Musteri musteri) {
        if (musteri.getGecikme() < 3){

        }else {
            setDeger(false);
        }
    }

//    @Override
//    public void kontrol(Musteri musteri) {
//        if(musteri.getGecikme() < 3){
//            System.out.println(deger);
//            super.execute(musteri);
//        }else {
//            setDeger(false);
//            System.out.println(deger);
//        }
//    }
}
