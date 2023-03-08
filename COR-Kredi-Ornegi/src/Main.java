public class Main {

    public static void main(String[] args) {
        Musteri musteri1 = new Musteri("Fırat Şakar");

        Kredi kbbSkorKontrol = new KBBSkorKontrol();
        Kredi krediKartiKontrol = new KrediKartiKontrol();
        Kredi kefilKontrol = new KefilKontrol();
        Kredi gelirKontrol = new GelirKontrol();
        Kredi firmaKontrol = new FirmaKontrol();

        kbbSkorKontrol.setNextKredi(krediKartiKontrol);
        krediKartiKontrol.setNextKredi(kefilKontrol);
        kefilKontrol.setNextKredi(gelirKontrol);
        gelirKontrol.setNextKredi(firmaKontrol);

        kbbSkorKontrol.krediVerilsinmi(musteri1);

        if(Kredi.isOnay()){
            System.out.println(musteri1.getMusteriAd()+ " Kredi Almaya Uygundur.");
        }else {
            System.out.println(musteri1.getMusteriAd()+ " Kredi Almaya Uygun Değildir.");
        }
    }
}
