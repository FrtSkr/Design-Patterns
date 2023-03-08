public class RezervasyonFacade {

    private Otel otel;
    private Ucus ucus;
    private Taksi taksi;

    public RezervasyonFacade() {
        this.otel = new Otel();
        this.ucus = new Ucus();
        this.taksi = new Taksi();
    }


    public void rezervasyonYap(String nereden, String nereye, String adres, String otelAdi){
        this.otel.otelRezervasyonu(otelAdi);
        this.ucus.ucusRezervasyon(nereden, nereye);
        this.taksi.taksiCagir(adres);
    }

}
