public class Main {

    public static void main(String[] args) {
	    Context context = new Context(new NormalGun());
	    context.fiyatAl();

	    context.setStrategy(new Yilbasi());
	    context.fiyatAl();

    }
}
