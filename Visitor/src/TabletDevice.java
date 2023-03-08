public class TabletDevice extends Device {
    public TabletDevice(String text) {
        super(text);
        this.brand = "IPad";
        this.model = "Air";
    }

    @Override
    public void printText(IPrinter printer) {
        printer.print(this);
    }
}
