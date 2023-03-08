public class Main {

    public static void main(String[] args) {
	    Eleman dilan = new Muhendis("Dilan");
	    dilan.setIzinHesap(new DepartmanA());
	    dilan.setMaasHesap(new MuhendisMaas());

	    dilan.izinHesapla();
	    dilan.maasHesapla();

    }
}
