public class Direct3DMode implements IVideoMode{

    private String MODE_NAME = "DIRECT 3D MODE";

    @Override
    public void GetScreen() {
        System.out.println("Mode is done: "+ getMODE_NAME());
    }

    public String getMODE_NAME() {
        return MODE_NAME;
    }
}
