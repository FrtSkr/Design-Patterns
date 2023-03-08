public abstract class Eleman {
    private String elemanAdi;
    private IzinHesapla izinHesap;
    private IMaasHesapla maasHesap;

    public Eleman(String elemanAdi) {
        this.elemanAdi = elemanAdi;
    }

    public IzinHesapla getIzinHesap() {
        return izinHesap;
    }

    public void setIzinHesap(IzinHesapla izinHesap) {
        this.izinHesap = izinHesap;
    }

    public IMaasHesapla getMaasHesap() {
        return maasHesap;
    }

    public void setMaasHesap(IMaasHesapla maasHesap) {
        this.maasHesap = maasHesap;
    }

    public abstract void izinHesapla();
    public abstract void maasHesapla();
}
