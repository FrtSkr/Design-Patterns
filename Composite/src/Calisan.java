public abstract class Calisan {
    protected  String Ad;
    protected  enPozisyon Pozisyon;

    public  Calisan(String Ad, enPozisyon Pozisyon){
        this.Ad = Ad;
        this.Pozisyon = Pozisyon;
    }

    public abstract void Goster();

}
