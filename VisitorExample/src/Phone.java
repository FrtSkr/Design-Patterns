public class Phone extends Device {
    public Phone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void openCamera(IVisitor visit) {
        visit.camera(this);
    }
}
