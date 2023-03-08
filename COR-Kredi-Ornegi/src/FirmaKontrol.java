public class FirmaKontrol extends Kredi {
    @Override
    public void krediVerilsinmi(Musteri musteri) {
        if (Kredi.isOnay()) {
            if (musteri.isCalistigiKurumKurumsalmi()) {
                System.out.println(Kredi.isOnay());
                //    System.out.println(musteri.getMusteriAd()+ " kredi almaya uygundur.");

            } else {
                //     System.out.println("Çalıştığı firma kurumsal olmadığından kredi alamaz.");
                Kredi.setOnay(false);
                System.out.println(Kredi.isOnay());
            }
        }

    }
}
