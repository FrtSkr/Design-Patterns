public class Main {

    public static void main(String[] args) {

        ModelManager modelManager = new ModelManager(new HondaModel());
        modelManager.makeAraba();

        ModelManager modelManager1 = new ModelManager(new MercedesModel());
        modelManager1.makeAraba();


    }
}
