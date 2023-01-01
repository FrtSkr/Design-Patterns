public class Main {

    public static void main(String[] args) {

        CompositeCalisan GenelMudur = new CompositeCalisan("Ali", enPozisyon.GenelMudur);
        GenelMudur.Ekle(new LeafCalisan("Hayriye", enPozisyon.DepartmanSorumlusu));

        CompositeCalisan Mudur = new CompositeCalisan("Ahmet", enPozisyon.Mudur);
        Mudur.Ekle(new LeafCalisan("Mehmet", enPozisyon.Isci));
        Mudur.Ekle(new LeafCalisan("Ayşe", enPozisyon.Isci));

        GenelMudur.Ekle(Mudur);

        GenelMudur.Goster();
        System.out.println();
        Mudur.Goster();

        System.out.println();
        GenelMudur.customGoster();

    }
}
