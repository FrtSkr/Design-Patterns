public class Calisan extends SirketCalisanlari {

    public Calisan(String ad, String soyad, Departman departman) {
        super(ad, soyad, departman);
    }

    @Override
    public void calisanGetir(SirketCalisanlari sirketCalisanlari) {
        System.out.println("\tAd: " + sirketCalisanlari.getAd() + "\tSoyad: " +
                sirketCalisanlari.getSoyad() + "\tDepartman: " + sirketCalisanlari.getDepartman());
    }
}
