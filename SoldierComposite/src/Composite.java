import java.util.ArrayList;
import java.util.List;

public class Composite extends RutbeliAsker {
    private List<Asker> askerler;

    public Composite(String ad, Rutbe rutbe) {
        super(ad, rutbe);
        this.askerler = new ArrayList<>();
    }

    @Override
    public void Goster() {
        System.out.println(super.ad + " " + super.rutbe.toString());
        if(this.askerler != null){
            for (Asker asker: askerler) {
                asker.Goster();
            }
        }
    }

    @Override
    public void Ekle(Asker a) {
        askerler.add(a);
    }

    @Override
    public void Sil(Asker a) {
        askerler.remove(a);
    }


}
