public class HondaModel extends ArabaBuilder {

    public HondaModel() {
        this.araba = new Araba();
    }

    @Override
    public Araba getAraba() {
        return araba;
    }

    @Override
    public void setModel() {
        this.araba.setModel("S2000");
    }

    @Override
    public void setMarka() {
        this.araba.setMarka("Honda");
    }

    @Override
    public void setRenk() {
        this.araba.setRenk("Kırmızı");
    }

    @Override
    public void setMotorGucu() {
        this.araba.setMotorGucu("3000");
    }
}
