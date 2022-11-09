public class UzakHedefAdapter implements IYedekleyici {
    private String domain = "192.168.1.1";


    @Override
    public void kaydet(String kaynak, String hedef) {
        UzakHedefKayit uzakHedefKayit = new UzakHedefKayit();
        uzakHedefKayit.UzakHedefKaydet(domain, kaynak, hedef);
    }
}
