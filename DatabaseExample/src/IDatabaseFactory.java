public interface IDatabaseFactory {
    Command createCommand();
    Connection createConnection();
}
