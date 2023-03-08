import java.io.File;

public class Main {

    public static void main(String[] args) {
        ILogger logger = new FileLogger();
        ILogger logger1 = new DatabaseLogger();
        ILogger logger2 = new AdapterLogger();

        logger.sendLog("LOG1");
        logger1.sendLog("LOG2");
        logger2.sendLog("LOG3");

    }
}
