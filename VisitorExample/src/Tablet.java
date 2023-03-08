public class Tablet extends Device{
    public Tablet(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void openCamera(IVisitor visit) {
        visit.camera(this);
    }
}
