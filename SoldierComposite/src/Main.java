public class Main {

    public static void main(String[] args) {

        RutbeliAsker Ali = new Composite("Ali", Rutbe.General);
        RutbeliAsker Mehmet = new Composite("Mehmet", Rutbe.Subay);

        RutbeliAsker Hasan = new Composite("Hasan", Rutbe.AstSubay);
        RutbeliAsker Kadir = new Composite("Kadir", Rutbe.AstSubay);
        RutbeliAsker Akif = new Composite("Akif", Rutbe.AstSubay);

        Asker Furkan = new RutbesizAsker("Furkan", Rutbe.Asker);
        Asker Taner = new RutbesizAsker("Taner", Rutbe.Asker);
        Asker Yusuf = new RutbesizAsker("Yusuf", Rutbe.Asker);
        Asker Mustafa = new RutbesizAsker("Mustafa", Rutbe.Asker);

        Mehmet.Ekle(Hasan);
        Mehmet.Ekle(Kadir);
        Mehmet.Ekle(Akif);

        Hasan.Ekle(Furkan);
        Hasan.Ekle(Yusuf);
        Kadir.Ekle(Taner);
        Akif.Ekle(Mustafa);
        Ali.Ekle(Mehmet);

        Ali.Goster();


    }
}
