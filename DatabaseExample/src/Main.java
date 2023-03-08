import jdk.jfr.DataAmount;

public class Main {

    public static void main(String[] args) {
            // FACADE OLMADAN
//        IDatabaseFactory sqlDatabase = SQLDatabase.getSqlDatabaseObj();
//        Command sqlCommand = sqlDatabase.createCommand();
//        Connection sqlConnection = sqlDatabase.createConnection();
//
//        if(sqlConnection.openConnection()){
//          String s = sqlCommand.sendCommand("SELECT * FROM USERS");
//          System.out.println(s);
//          s = sqlCommand.sendCommand("SELECT name, lastName FROM USERS");
//          System.out.println(s);
//          sqlConnection.closeConnection();
//        }
        // FACADE İLE
        DataBaseFacade facade = new DataBaseFacade();
        facade.newSqlCommand("SELECT * FROM USERS");
        facade.newSqlCommand("SELECT user_name, user_email FROM USERS");
        facade.newOracleCommand("NULLNULLLNULL");
        facade.newOracleCommand("NULLNULLLNULLNULLNULLLNULL");





    }
}
