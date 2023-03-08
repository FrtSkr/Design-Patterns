import java.util.ArrayList;
import java.util.List;

public  abstract class RutbeliAsker extends Asker {


    public RutbeliAsker(String ad, Rutbe rutbe) {
        super(ad, rutbe);
    }

    public abstract void Ekle(Asker a);
    public abstract void Sil(Asker a);





}
