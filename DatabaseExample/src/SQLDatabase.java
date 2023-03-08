public class SQLDatabase implements IDatabaseFactory {
    private static SQLDatabase sqlDatabase;

    private SQLDatabase(){}

    public static SQLDatabase getSqlDatabaseObj(){
        if ( sqlDatabase == null ){
            sqlDatabase = new SQLDatabase();
        }
        return sqlDatabase;
    }

    @Override
    public Command createCommand() {
        return SQLCommand.getSqlCommandObj();
    }

    @Override
    public Connection createConnection() {
        return SQLConnection.getSqlConnectionObj();
    }
}
