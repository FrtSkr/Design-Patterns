public class Main {

    public static void main(String[] args) {

        Device mobileDevice = new MobileDevice("Mobile device is here");
        Device computerDevice = new ComputerDevice("Computer device is here");
        Device tabletDevice = new TabletDevice("Tablet device is here");


        mobileDevice.printText(new HPPrinter());
        System.out.println();
        mobileDevice.printText(new SamsungPrinter());
        System.out.println();
        computerDevice.printText(new CanonPrinter());
        System.out.println();
        tabletDevice.printText(new HPPrinter());
        System.out.println();
        tabletDevice.printText(new SamsungPrinter());
        System.out.println();
        tabletDevice.printText(new CanonPrinter());
    }
}
