public class Muhendis extends Eleman {
    public Muhendis(String elemanAdi) {
        super(elemanAdi);
    }

    @Override
    public void izinHesapla() {
        this.getIzinHesap().hesapla();
    }

    @Override
    public void maasHesapla() {
        this.getMaasHesap().hesapla();
    }
}
