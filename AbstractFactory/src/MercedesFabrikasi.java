public class MercedesFabrikasi implements IArabaFabrikasi {
    public MercedesFabrikasi() {
        super();
    }

    @Override
    public IArabaKasasi kasaUret() {
        return new MercedesKasa();
    }

    @Override
    public IArabaLastigi lastikUret() {
        return new MercedesLastik();
    }
}
