import java.util.ArrayList;
import java.util.List;

public class Buzdolabi extends Subject {
    private List<IObserver> observerList;

    public Buzdolabi(String urunAd, Double urunFiyat) {
        super(urunAd, urunFiyat);
        this.observerList = new ArrayList<>();
    }

    @Override
    public void setUrunFiyat(Float urunFiyat) {
        if(getUrunFiyat() > urunFiyat){
            notifyObserver();
        }
        super.setUrunFiyat(urunFiyat);
    }



    @Override
    public void register(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void deregister(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver obs: observerList) {
            obs.update();
        }
    }
}
