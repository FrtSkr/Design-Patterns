public class ModelManager {
    private ArabaBuilder arabaBuilder;

    public ModelManager(ArabaBuilder arabaBuilder) {
        this.arabaBuilder = arabaBuilder;
    }

    public void makeAraba(){

        this.arabaBuilder.setMarka();
        this.arabaBuilder.setModel();
        this.arabaBuilder.setRenk();
        this.arabaBuilder.setMotorGucu();
        getAraba();
        System.out.println();

    }

    private void getAraba(){
        System.out.println("Marka: "+ this.arabaBuilder.getAraba().getMarka());
        System.out.println("Model: "+ this.arabaBuilder.getAraba().getModel());
        System.out.println("Renk: "+ this.arabaBuilder.getAraba().getRenk());
        System.out.println("Motor Gücü: "+ this.arabaBuilder.getAraba().getMotorGucu());
    }
}
