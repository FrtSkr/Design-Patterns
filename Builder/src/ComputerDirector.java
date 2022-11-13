public class ComputerDirector {


    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void createComputer(String processor, String HDD, String RAM){
        this.computerBuilder.createName();
        this.computerBuilder.createHDD(HDD);
        this.computerBuilder.createProcessor(processor);
        this.computerBuilder.createRAM(RAM);
    }
}
