public class AdapterLogger implements ILogger {
    private AdapteeLogger adapteeLogger;

    public AdapterLogger() {
        this.adapteeLogger = new AdapteeLogger();
    }

    @Override
    public void sendLog(String log) {
        this.adapteeLogger.MobileLogger(log);
    }
}
