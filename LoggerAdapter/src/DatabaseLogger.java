public class DatabaseLogger implements ILogger {
    @Override
    public void sendLog(String log) {
        System.out.println("Database Logger");
    }
}
