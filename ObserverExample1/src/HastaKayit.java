public class HastaKayit implements IObserver {
    private String hastaAd;
    private String hastaEmail;
    private String hastaTelefon;

    public HastaKayit(String hastaAd, String hastaEmail, String hastaTelefon) {
        this.hastaAd = hastaAd;
        this.hastaEmail = hastaEmail;
        this.hastaTelefon = hastaTelefon;
    }

    @Override
    public void sendNotify(Tahlil tahlil) {
        System.out.println("Sayın "+this.hastaAd+", tahlil sonucunuz çıkmıştır: "+ tahlil.getTahlilAdi());
    }
}
