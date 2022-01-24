public class SQL implements IDatabaseConnection, IDatabaseQuery{
    @Override
    public void openConnection() {
        System.out.println("SQL: Bağlantı Açıldı.");
    }

    @Override
    public void closeConnection() {
        System.out.println("SQL: Bağlantı Kapatıldı.");
    }

    @Override
    public void query(String s) {
        System.out.println("SQL Sorgu: "+ s);
    }
}
