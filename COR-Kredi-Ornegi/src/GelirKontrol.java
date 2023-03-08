public class GelirKontrol extends Kredi {
    public GelirKontrol() {
    }

    @Override
    public void krediVerilsinmi(Musteri musteri) {
        if (Kredi.isOnay()){
            if(musteri.getMaas() > 5000){
                System.out.println(Kredi.isOnay());
                this.nextKredi.krediVerilsinmi(musteri);

            }else{
              //  System.out.println("Aylık gelir kredi için uygun değil, kredi alamaz.");
                Kredi.setOnay(false);
                System.out.println(Kredi.isOnay());
            }
        }

    }
}
