public class OracleConnection implements Connection {

    private static OracleConnection oracleConnection;
    private OracleConnection() {}

    public static OracleConnection getOracleConnectionObj(){
        if( oracleConnection == null){
            oracleConnection = new OracleConnection();
        }
        return oracleConnection;
    }

    @Override
    public boolean openConnection() {
        return true;
    }

    @Override
    public boolean closeConnection() {
        return true;
    }
}
