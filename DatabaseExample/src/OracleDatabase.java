public class OracleDatabase implements IDatabaseFactory {
    private static OracleDatabase oracleDatabase;

    private OracleDatabase(){}

    public static OracleDatabase getOracleDatabaseObj(){
        if( oracleDatabase == null ) {
            oracleDatabase = new OracleDatabase();
        }
        return oracleDatabase;
    }

    @Override
    public Command createCommand() {
        return OracleCommand.getOracleCommandObj();
    }

    @Override
    public Connection createConnection() {
        return OracleConnection.getOracleConnectionObj();
    }
}
