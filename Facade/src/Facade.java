public class Facade {
    private SQL sql;
    private Oracle oracle;

    public Facade() {
        this.sql = new SQL();
        this.oracle = new Oracle();
    }

    public void SQLQuery(String s){
        sql.openConnection();
        sql.query(s);
        sql.closeConnection();
    }

    public void OracleQuery(String s){
        oracle.openConnection();
        oracle.query(s);
        oracle.closeConnection();
    }
}
