public class SamsungPrinter implements IPrinter{
    @Override
    public void print(MobileDevice mobileDevice) {
        System.out.println("Yazıcı Marka: Samsung");
        System.out.println("Yazdırılan Veri: " + mobileDevice.getText() +"\n"+ "Yazdıran Cihaz: "+ mobileDevice.brand + " " + mobileDevice.model);
    }

    @Override
    public void print(ComputerDevice computerDevice) {
        System.out.println("Yazıcı Marka: Samsung");
        System.out.println("Yazdırılan Veri: " + computerDevice.getText() +"\n"+ "Yazdıran Cihaz: "+ computerDevice.brand + " " + computerDevice.model);
    }

    @Override
    public void print(TabletDevice tabletDevice) {
        System.out.println("Yazıcı Marka: Samsung");
        System.out.println("Yazdırılan Veri: " + tabletDevice.getText() +"\n"+ "Yazdıran Cihaz: "+ tabletDevice.brand + " " + tabletDevice.model);
    }
}
