public class Computer {

    private String computer_name;
    private String computer_HDD;
    private String computer_processor;
    private String computer_RAM;

    public String getComputer_name() {
        return computer_name;
    }

    public void setComputer_name(String computer_name) {
        this.computer_name = computer_name;
    }

    public String getComputer_HDD() {
        return computer_HDD;
    }

    public void setComputer_HDD(String computer_HDD) {
        this.computer_HDD = computer_HDD;
    }

    public String getComputer_processor() {
        return computer_processor;
    }

    public void setComputer_processor(String computer_processor) {
        this.computer_processor = computer_processor;
    }

    public String getComputer_RAM() {
        return computer_RAM;
    }

    public void setComputer_RAM(String computer_RAM) {
        this.computer_RAM = computer_RAM;
    }

    public void computerAttributes(){
        System.out.println("Computer Brand: "+ getComputer_name());
        System.out.println("Computer HDD: "+ getComputer_HDD());
        System.out.println("Computer Processor: "+ getComputer_processor());
        System.out.println("Computer RAM: "+ getComputer_RAM());
    }
}
