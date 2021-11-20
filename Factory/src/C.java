public class C implements IConverter {
    public C() {
    }

    @Override
    public void convert(IConverter converter) {
        System.out.println("Converter to C ...");
    }
}
