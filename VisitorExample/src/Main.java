public class Main {

    public static void main(String[] args) {
        Device phone = new Phone("IPhone", "13 PRO MAX");
        Device tablet = new Tablet("IPad", "5");

        phone.openCamera(new Camera());
        tablet.openCamera(new Camera());
    }
}
