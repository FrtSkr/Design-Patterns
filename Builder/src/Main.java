public class Main {

    public static void main(String[] args) {
        DirectorPhone directorPhone = new DirectorPhone(new Samsung());
        directorPhone.producePhone();

        directorPhone.setBuilderPhone(new IPhone());
        directorPhone.producePhone();
    }
}
