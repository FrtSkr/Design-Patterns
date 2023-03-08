public class Main {

    public static void main(String[] args) {

        CompositeCalisan Ahmet = new CompositeCalisan("Ahmet", "L1", Departman.Yonetici);

        SirketCalisanlari Altan = new Calisan("Altan", "L2", Departman.Tasarimci);
        SirketCalisanlari Atıl = new Calisan("Atıl", "L3", Departman.Yazilimci);
        SirketCalisanlari Ayhan = new Calisan("Ayhan", "L4", Departman.Yazilimci);

        Ahmet.Ekle(Altan);
        Ahmet.Ekle(Atıl);
        Ahmet.Ekle(Ayhan);
        Ahmet.calisanGetir(Ahmet);
        Ahmet.yazilimcilariGetir();

        CompositeCalisan Aysel = new CompositeCalisan("Aysel", "A1", Departman.Yonetici);

        SirketCalisanlari Kadir = new Calisan("Kadir", "A2", Departman.Tasarimci);
        SirketCalisanlari Ayşegül = new Calisan("Ayşegül", "A3", Departman.Yazilimci);
        SirketCalisanlari Dilara = new Calisan("Dilara", "A4", Departman.Yazilimci);
        SirketCalisanlari Gokhan = new Calisan("Gokhan", "A5", Departman.Tasarimci);

        Aysel.Ekle(Kadir);
        Aysel.Ekle(Ayşegül);
        Aysel.Ekle(Dilara);
        Aysel.Ekle(Gokhan);
        Aysel.calisanGetir(Aysel);

        Aysel.tasarimcilariGetir();
        Aysel.Sil(Gokhan);
        Aysel.tasarimcilariGetir();

        Ahmet.Ekle(Aysel);
        Ahmet.calisanGetir(Ahmet);

    }
}
