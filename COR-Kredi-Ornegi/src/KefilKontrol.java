public class KefilKontrol extends Kredi {
    public KefilKontrol() {
    }

    @Override
    public void krediVerilsinmi(Musteri musteri) {
        if (Kredi.isOnay()) {
            if (musteri.isKefilVarmi()) {
                System.out.println(Kredi.isOnay());
                this.nextKredi.krediVerilsinmi(musteri);

            } else {
                // System.out.println("Kefil durumu uygun olmadığı için kredi alamaz.");
                Kredi.setOnay(false);
                System.out.println(Kredi.isOnay());
            }
        }

    }
}
