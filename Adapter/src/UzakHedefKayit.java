public class UzakHedefKayit {
    public void UzakHedefKaydet(String domain, String hedef, String kaynak){
       baglantiKur();
       dosyaGonder(kaynak, domain+hedef);
       baglantiKapat();
    }

    public void baglantiKur(){
        System.out.println("Bağlantı Kuruldu");
    }
    public void dosyaGonder(String s1, String s2){
        System.out.println(s1 + " Dosyası "+ s2 + "'ye kayıt edildi.");
    }
    public void baglantiKapat(){
        System.out.println("Bağlantı Kapatıldı.");
    }


}
