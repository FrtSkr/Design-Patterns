public class OracleCommand implements Command{

    private static OracleCommand oracleCommand;

    private OracleCommand() {}

    public static OracleCommand getOracleCommandObj(){
        if( oracleCommand == null){
            oracleCommand = new OracleCommand();
        }
        return oracleCommand;
    }

    @Override
        public String sendCommand(String command) {
        return "Oracle Command: " + command;
    }
}
