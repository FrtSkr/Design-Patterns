import java.util.ArrayList;
import java.util.List;

public class CompositeCalisan extends  Calisan{
    private List<Calisan> Calisanlar;
    public CompositeCalisan(String Ad, enPozisyon Pozisyon) {
        super(Ad, Pozisyon);
        this.Calisanlar = new ArrayList<>();
    }

    public void Ekle(Calisan c){
        Calisanlar.add(c);
    }

    @Override
    public void Goster() {
        System.out.println(super.Pozisyon.toString() + " " + super.Ad);
        if(Calisanlar != null){
            for (Calisan c: Calisanlar) {
                c.Goster();

            }
        }

    }

    public void customGoster(){
        System.out.println(super.Pozisyon.toString() + " " + super.Ad);
        if(Calisanlar != null){
            for (Calisan c : Calisanlar){
                System.out.println(c.Pozisyon + " "+ c.Ad);
            }
        }

    }
}
