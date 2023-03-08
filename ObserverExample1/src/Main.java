public class Main {

    public static void main(String[] args) {
        KanTahlili kanTahlili = new KanTahlili("Kan Tahlili");
        IdrarTahlili idrarTahlili = new IdrarTahlili("İdrar Tahlili");

        HastaKayit hastaKayit = new HastaKayit("Fırat Şakar", "asda@gmail.com", "111");
        HastaKayit hastaKayit1 = new HastaKayit("ff şş", "asda@gmail.com", "111");
        HastaKayit hastaKayit2 = new HastaKayit("fff şşş", "asda@gmail.com", "111");

        kanTahlili.gozlemciEkle(hastaKayit);
        kanTahlili.gozlemciEkle(hastaKayit2);

        idrarTahlili.gozlemciEkle(hastaKayit);
        idrarTahlili.gozlemciEkle(hastaKayit1);

        kanTahlili.setTahlilSonucu(true);
        idrarTahlili.setTahlilSonucu(false);
    }
}
