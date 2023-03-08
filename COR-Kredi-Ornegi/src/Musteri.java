public class Musteri {
    private String musteriAd;
    private final int KBBSkor = 1000;
    private final boolean krediKartiVarmi = true;
    private final boolean kefilVarmi = true;
    private final double maas = 5500;
    private final boolean calistigiKurumKurumsalmi = true;

    public Musteri(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public int getKBBSkor() {
        return KBBSkor;
    }

    public boolean isKrediKartiVarmi() {
        return krediKartiVarmi;
    }

    public boolean isKefilVarmi() {
        return kefilVarmi;
    }

    public double getMaas() {
        return maas;
    }

    public boolean isCalistigiKurumKurumsalmi() {
        return calistigiKurumKurumsalmi;
    }
}
