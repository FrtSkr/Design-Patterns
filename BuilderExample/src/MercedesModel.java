public class MercedesModel extends  ArabaBuilder{

    public MercedesModel() {
        this.araba = new Araba();
    }

    @Override
    public Araba getAraba() {
        return araba;
    }

    @Override
    public void setModel() {
        this.araba.setModel("CLA 180");
    }

    @Override
    public void setMarka() {
        this.araba.setMarka("Mercedes");

    }

    @Override
    public void setRenk() {
        this.araba.setRenk("Siyah");

    }

    @Override
    public void setMotorGucu() {
        this.araba.setMotorGucu("2500");
    }
}
