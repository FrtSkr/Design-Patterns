public class FabrikaOtomasyon {
    private IArabaFabrikasi arabaFabrikasi;
    private IArabaKasasi arabaKasasi;
    private IArabaLastigi arabaLastigi;

    public FabrikaOtomasyon(IArabaFabrikasi arabaFabrikasi) {
        this.arabaFabrikasi = arabaFabrikasi;
        this.arabaKasasi = arabaFabrikasi.kasaUret();
        this.arabaLastigi = arabaFabrikasi.lastikUret();
    }

    public void parcalariBirlestir(){

        System.out.println(this.arabaKasasi.kasaUret());
        System.out.println(this.arabaLastigi.lastikUret());
        System.out.println("Parçalar Üretilip Birleştirildi...");
    }

}
