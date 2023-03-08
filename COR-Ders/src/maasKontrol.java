public class maasKontrol extends Kredi {
    @Override
    public void kontrol2(Musteri musteri) {
        if (musteri.isMaasYeterlimi()){

        }else {
            setDeger(false);
        }
    }

//    @Override
//    public void kontrol(Musteri musteri) {
//        if (musteri.isMaasYeterlimi()){
//            System.out.println(deger);
//            super.execute(musteri);
//        }else {
//            setDeger(false);
//            System.out.println(deger);
//        }
//    }
}
