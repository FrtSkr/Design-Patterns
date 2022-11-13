public class Main {

    public static void main(String[] args) {
        DBAbstraction dbAbstraction = new DBRefinedAbstraction();
        dbAbstraction.ConOpen(); // Default sql
        dbAbstraction.Exec();

        dbAbstraction.setDbImplementor(new OracleImp());
        dbAbstraction.Exec();
        dbAbstraction.ConOpen();

        dbAbstraction.setDbImplementor(new SqlServerImp());
        dbAbstraction.Exec();
        dbAbstraction.ConOpen();



    }
}
