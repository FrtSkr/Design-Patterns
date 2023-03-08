import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected String productName;
    protected double productPrice;
    private List<Observer> observerList;

    public Observable(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.observerList = new ArrayList<>();
    }

    public void addObserver(Observer o){
        this.observerList.add(o);
    }

    public void removeObserver(Observer o){
        this.observerList.remove(o);
    }

    public void notification(){
        for (Observer o: this.observerList) {
            o.sendNotify(this.productName);
        }
    }

}
