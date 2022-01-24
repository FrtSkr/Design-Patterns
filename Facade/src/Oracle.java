public class Oracle implements IDatabaseQuery, IDatabaseConnection {
    @Override
    public void openConnection() {
        System.out.println("Oracle: Bağlantı Açıldı.");
    }

    @Override
    public void closeConnection() {
        System.out.println("Oracle: Bağlantı Kapatıldı.");
    }

    @Override
    public void query(String s) {
        System.out.println("Oracle Sorgu: "+ s);
    }
}
