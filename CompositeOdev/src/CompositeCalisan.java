import java.util.ArrayList;
import java.util.List;

public class CompositeCalisan extends SirketCalisanlari {
    private List<SirketCalisanlari> calisanListe = new ArrayList<>();

    public List<SirketCalisanlari> getCalisanListe() {
        return calisanListe;
    }


    public CompositeCalisan(String ad, String soyad, Departman departman) {
        super(ad, soyad, departman);
    }

    public void Ekle(SirketCalisanlari calisan) {
        calisanListe.add(calisan);
    }

    public void Sil(SirketCalisanlari calisan) {
        calisanListe.remove(calisan);
    }

    public void yazilimcilariGetir(){
        System.out.println("Ad: " + getAd() + "\tSoyad: " +
                getSoyad() + "\tDepartman: " + getDepartman());
        for (SirketCalisanlari calisan: calisanListe) {
            if (calisan.getDepartman().toString().equalsIgnoreCase("yazilimci")){
                System.out.println("\tAd: " + calisan.getAd() + "\tSoyad: " +
                        calisan.getSoyad() + "\tDepartman: " + calisan.getDepartman());
            }
        }
        draw();
    }

    public void tasarimcilariGetir(){
        System.out.println("Ad: " + getAd() + "\tSoyad: " +
                getSoyad() + "\tDepartman: " + getDepartman());
        for (SirketCalisanlari calisan: calisanListe) {
            if (calisan.getDepartman().toString().equalsIgnoreCase("tasarimci")){
                System.out.println("\tAd: " + calisan.getAd() + "\tSoyad: " +
                        calisan.getSoyad() + "\tDepartman: " + calisan.getDepartman());
            }
        }
        draw();
    }



    @Override
    public void calisanGetir(SirketCalisanlari sirketCalisanlari) {
        System.out.println("Ad: " + sirketCalisanlari.getAd() + "\tSoyad: " +
                sirketCalisanlari.getSoyad() + "\tDepartman: " + sirketCalisanlari.getDepartman());
        for (SirketCalisanlari calisan : calisanListe) {
            calisan.calisanGetir(calisan);
//            System.out.println("\tAd: " + calisan.getAd() + "\tSoyad: " +
//                    calisan.getSoyad() + "\tDepartman: " + calisan.getDepartman());


        }
        draw();
    }

    private void draw(){
        System.out.println("---------------------------------------------------------------------------");
    }
}
