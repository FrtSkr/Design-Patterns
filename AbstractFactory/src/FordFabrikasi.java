public class FordFabrikasi implements IArabaFabrikasi {

    @Override
    public IArabaKasasi kasaUret() {
        return new FordKasa();
    }

    @Override
    public IArabaLastigi lastikUret() {
        return new FordLastik();
    }
}

