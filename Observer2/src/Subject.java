public abstract class Subject {

    private String urunAd;
    private Double urunFiyat;

    public Subject(String urunAd, Double urunFiyat) {
        this.urunAd = urunAd;
        this.urunFiyat = urunFiyat;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public Double getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(Double urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public abstract void register(IObserver observer);
    public abstract void deregister(IObserver observer);
    public abstract void notifyObserver();
}
