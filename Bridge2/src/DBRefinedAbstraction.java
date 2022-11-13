public class DBRefinedAbstraction extends DBAbstraction {

    public DBRefinedAbstraction(){}

    public DBRefinedAbstraction(IDBImplementor dbImplementor) {
        super(dbImplementor);
    }

    @Override
    public void ConOpen() {
        getDbImplementor().OpenCon();
    }

    @Override
    public void Exec() {
        getDbImplementor().Execute();
    }


}
