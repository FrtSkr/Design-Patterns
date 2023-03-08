import java.util.ArrayList;
import java.util.List;
public abstract class Tahlil {

    private List<IObserver> observerList;
    private String tahlilAdi;
    private boolean tahlilSonucu = false;

    public Tahlil(String tahlilAdi) {
        this.tahlilAdi = tahlilAdi;
        this.observerList = new ArrayList<>();
    }

    public void gozlemciEkle(IObserver observer){
        this.observerList.add(observer);
    }

    public void gozlemciSil(IObserver observer){
        this.observerList.remove(observer);
    }

    public String getTahlilAdi() {
        return tahlilAdi;
    }

    public boolean isTahlilSonucu() {
        return tahlilSonucu;
    }

    public void setTahlilSonucu(boolean tahlilSonucu) {
        this.tahlilSonucu = tahlilSonucu;
        if (tahlilSonucu){
            tahlilSonucBildir();
        }
    }

    private void tahlilSonucBildir(){
        for (IObserver o: this.observerList) {
            o.sendNotify(this);

        }
    }
}
