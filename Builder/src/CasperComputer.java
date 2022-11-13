public class CasperComputer extends ComputerBuilder {
    public CasperComputer() {
        this.computer = new Computer();
    }
    @Override
    public void createName(){
        this.computer.setComputer_name("Casper");
    }

    @Override
    public void createProcessor(String s) {
        this.computer.setComputer_processor(s);
    }

    @Override
    public void createHDD(String s) {
        this.computer.setComputer_HDD(s);

    }

    @Override
    public void createRAM(String s) {
        this.computer.setComputer_RAM(s);

    }
}
