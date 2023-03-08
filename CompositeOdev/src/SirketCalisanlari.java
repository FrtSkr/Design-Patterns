public abstract class SirketCalisanlari {

    private String ad;
    private String soyad;
    private Departman departman;

    public SirketCalisanlari(String ad, String soyad, Departman departman) {
        this.ad = ad;
        this.soyad = soyad;
        this.departman = departman;
    }

    public String getAd() {
        return ad;
    }


    public String getSoyad() {
        return soyad;
    }


    public Departman getDepartman() {
        return departman;
    }



    public abstract void calisanGetir(SirketCalisanlari sirketCalisanlari);

}
