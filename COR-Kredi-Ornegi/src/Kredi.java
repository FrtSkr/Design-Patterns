public abstract class Kredi {
    private static boolean onay = true;

    public Kredi() {
    }

    public static boolean isOnay() {
        return onay;
    }

    public static void setOnay(boolean onay) {
        Kredi.onay = onay;
    }

    protected Kredi nextKredi;

    public abstract void krediVerilsinmi(Musteri musteri);

    public void setNextKredi(Kredi nextKredi) {
        this.nextKredi = nextKredi;
    }
}
