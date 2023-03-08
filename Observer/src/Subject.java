public interface  Subject {
    void register(IObserver observer);
    void deregister(IObserver observer);
    void notifyObservers();
    void addProduct(Product product);
}
