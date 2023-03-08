import jdk.jshell.spi.ExecutionControl;

public class RutbesizAsker extends Asker{


    public RutbesizAsker(String ad, Rutbe rutbe) {
        super(ad, rutbe);
    }

    @Override
    public void Goster() {
        System.out.println(super.ad + " " + super.rutbe.toString());
    }

}
