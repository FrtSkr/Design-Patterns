public class Main {

    public static void main(String[] args) {

        Observer esra = new User("Esra Daşdelen");
        Observer eda = new User("Eda Güzel");
        Observer ipek = new User("İpek Yılmaz");

        BMW bmw = new BMW("BMW M4", 150.000);
        TOGG togg = new TOGG("TOGG", 175.000);

        bmw.addObserver(esra);
        bmw.addObserver(ipek);

        togg.addObserver(eda);
        togg.addObserver(ipek);
        togg.addObserver(esra);

        bmw.setPrice(170.000);
        togg.setPrice(180.000);

        bmw.removeObserver(esra);
        bmw.setPrice(170.000);

    }
}
