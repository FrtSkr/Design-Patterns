public class ConverterFactory {
    public ConverterFactory() {
    }
    // Factory desenimiz
    public IConverter createConverter(String language){
        if(language.equalsIgnoreCase("C")){
            return new C();
        }else if(language.equalsIgnoreCase("PHP")){
            return new PHP();
        }else if(language.equalsIgnoreCase("Python")){
            return new Python();
        }else{
            System.out.println("Incorrect Entry");
            return null;
        }
    }

}
