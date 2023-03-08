public class SQLCommand implements Command {
    private static SQLCommand sqlCommand;

    private SQLCommand(){}

    public static SQLCommand getSqlCommandObj(){
        if ( sqlCommand == null ){
            sqlCommand = new SQLCommand();
        }
        return sqlCommand;
    }

    @Override
    public String sendCommand(String command) {
        return "SQL Command: " + command;
    }
}
