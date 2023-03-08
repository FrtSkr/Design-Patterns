public class MobileDevice extends Device {
    public MobileDevice(String text) {
        super(text);
        this.model = "12 PRO MAX";
        this.brand = "IPhone";
    }

    @Override
    public void printText(IPrinter printer) {
        printer.print(this);
    }
}
