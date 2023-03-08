public class ComputerDevice extends Device {
    public ComputerDevice(String text) {
        super(text);
        this.brand = "Asus";
        this.model = "ZenBook14 Ux425";
    }

    @Override
    public void printText(IPrinter printer) {
        printer.print(this);
    }
}
