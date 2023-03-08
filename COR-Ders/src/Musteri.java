public class Musteri {
    private int skor;
    private int gecikme;
    private boolean kefil;
    private boolean maasYeterlimi;

    public Musteri(int skor, int gecikme, boolean kefil, boolean maasYeterlimi) {
        this.skor = skor;
        this.gecikme = gecikme;
        this.kefil = kefil;
        this.maasYeterlimi = maasYeterlimi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getGecikme() {
        return gecikme;
    }

    public void setGecikme(int gecikme) {
        this.gecikme = gecikme;
    }

    public boolean isKefil() {
        return kefil;
    }

    public void setKefil(boolean kefil) {
        this.kefil = kefil;
    }

    public boolean isMaasYeterlimi() {
        return maasYeterlimi;
    }

    public void setMaasYeterlimi(boolean maasYeterlimi) {
        this.maasYeterlimi = maasYeterlimi;
    }
}
