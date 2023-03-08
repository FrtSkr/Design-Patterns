public abstract class Device {

    protected String brand;
    protected String model;
    private String text;

    public Device(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract void printText(IPrinter printer);

}
