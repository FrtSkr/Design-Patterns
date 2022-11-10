public class OpenGLMode implements  IVideoMode{

    private String MODE_NAME = "OPEN GL MODE";

    @Override
    public void GetScreen() {
        System.out.println("Mode is done: "+ getMODE_NAME());
    }

    public String getMODE_NAME() {
        return MODE_NAME;
    }
}
