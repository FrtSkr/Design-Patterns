import java.util.ArrayList;
import java.util.List;

public class Proxy implements Subject {
    private List<IObserver> observerList;
    private List<Product> productList;


    public Proxy() {
        this.observerList = new ArrayList<>();
        this.productList = new ArrayList<>();
    }
    @Override
    public void addProduct(Product product){
        productList.add(product);
    }

    @Override
    public void register(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deregister(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Product pr : productList) {
            if(pr.getChanged()){
                for (IObserver obs: observerList) {
                    obs.update();
                }
                pr.setChanged(false);
            }

        }

    }
}
