public class Camera implements IVisitor {
    @Override
    public void camera(Phone p) {
        System.out.println("Phone Brand: "+ p.getBrand()+"\nPhone Model: "+p.getModel()+"\nKamera is opening ...");
    }

    @Override
    public void camera(Tablet t) {
        System.out.println("Tablet Brand: "+ t.getBrand()+"\nTablet Model: "+t.getModel()+"\nKamera is opening ...");
    }
}
