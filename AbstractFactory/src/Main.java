public class Main {

    public static void main(String[] args) {

        IArabaFabrikasi arabaFabrikasi = new MercedesFabrikasi();
        FabrikaOtomasyon otomasyon = new FabrikaOtomasyon(arabaFabrikasi);
        otomasyon.parcalariBirlestir();

    }
}
