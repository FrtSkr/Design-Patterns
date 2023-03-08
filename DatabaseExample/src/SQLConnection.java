public class SQLConnection implements Connection{
    private static SQLConnection sqlConnection;

    private SQLConnection(){}

    public static SQLConnection getSqlConnectionObj(){
        if ( sqlConnection == null ){
            sqlConnection = new SQLConnection();
        }
        return sqlConnection;
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
