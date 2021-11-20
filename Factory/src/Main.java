public class Main {

    public static void main(String[] args) {

        ConverterFactory cf = new ConverterFactory();

        IConverter converterPHP = cf.createConverter("PHP");
        IConverter converterC = cf.createConverter("C");
        IConverter converterPython = cf.createConverter("Python");


        converterPHP.convert(converterC);
        converterC.convert(converterPHP);
        converterPython.convert(converterC);

    //  IConverter converterJava = cf.convert("Java");

    }
}
