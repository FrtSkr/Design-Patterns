public class FileLogger implements ILogger{
    @Override
    public void sendLog(String log) {
        System.out.println("File Logger");
    }
}
