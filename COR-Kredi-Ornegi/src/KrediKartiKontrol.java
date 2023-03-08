public class KrediKartiKontrol extends Kredi {
    public KrediKartiKontrol() {
    }

    @Override
    public void krediVerilsinmi(Musteri musteri) {
        if (Kredi.isOnay()) {
            if (musteri.isKrediKartiVarmi()) {
                System.out.println(Kredi.isOnay());
                this.nextKredi.krediVerilsinmi(musteri);

            } else {
                //  System.out.println("Kredi kartı olmadığı için kredi alamaz.");
                Kredi.setOnay(false);
                System.out.println(Kredi.isOnay());
            }
        }

    }
}
