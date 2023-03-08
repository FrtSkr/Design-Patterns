public class KBBSkorKontrol extends Kredi {

    public KBBSkorKontrol() {
    }

    @Override
    public void krediVerilsinmi(Musteri musteri) {
        if (Kredi.isOnay()) {
            if (musteri.getKBBSkor() >= 1000) {
                System.out.println(Kredi.isOnay());
                this.nextKredi.krediVerilsinmi(musteri);


            } else {
                //   System.out.println("KBB Skoru 1000'den düşük olduğu için kredi alamaz.");
                Kredi.setOnay(false);
                System.out.println(Kredi.isOnay());
            }
        }

    }
}
