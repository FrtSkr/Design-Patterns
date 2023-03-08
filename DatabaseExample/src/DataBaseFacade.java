public class DataBaseFacade {

    private final Connection sqlConnection;
    private final Connection oracleConnection;
    private final Command sqlCommand;
    private final Command oracleCommand;

    public DataBaseFacade(){
        this.sqlCommand = SQLDatabase.getSqlDatabaseObj().createCommand();
        this.sqlConnection = SQLDatabase.getSqlDatabaseObj().createConnection();
        this.oracleCommand = OracleDatabase.getOracleDatabaseObj().createCommand();
        this.oracleConnection = OracleDatabase.getOracleDatabaseObj().createConnection();
    }

    public void newSqlCommand(String command){
        if(sqlConnection.openConnection()){
            System.out.println(sqlCommand.sendCommand(command));
            sqlConnection.closeConnection();
        }
    }

    public void newOracleCommand(String command){
        if(oracleConnection.openConnection()){
            System.out.println(oracleCommand.sendCommand(command));
            oracleConnection.closeConnection();
        }
    }



}
