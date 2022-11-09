public class DiskYedekleyici implements IYedekleyici {

    @Override
    public void kaydet(String kaynak, String hedef) {
        System.out.println(kaynak+"'tan "+ hedef +"'e kopyalandı");
    }
}
