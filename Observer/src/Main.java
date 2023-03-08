public class Main {

    public static void main(String[] args) {

        Subject subject = new Proxy();
        IObserver observer = new CustomerObserver();
        Product product = new Product("60");
        Product product1 = new Product("80");
        subject.register(observer);
        subject.addProduct(product);
        subject.addProduct(product1);

        subject.notifyObservers();
        product1.setFiyat("40");
        product.setFiyat("30");

        subject.notifyObservers();
        product.setFiyat("20");
        subject.notifyObservers();

    }
}
