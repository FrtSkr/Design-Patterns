public class DBAbstraction {

    private IDBImplementor dbImplementor;
    public DBAbstraction(){}

    public DBAbstraction(IDBImplementor dbImplementor) {
        this.dbImplementor = dbImplementor;
    }

    public void ConOpen() {
        if (dbImplementor == null) dbImplementor = new SqlServerImp();

        dbImplementor.OpenCon();
    }

    public void Exec() {
        if (dbImplementor == null) dbImplementor = new SqlServerImp();

        dbImplementor.Execute();
    }

    public IDBImplementor getDbImplementor() {
        if (dbImplementor == null) dbImplementor = new SqlServerImp();

        return dbImplementor;
    }

    public void setDbImplementor(IDBImplementor dbImplementor) {
        this.dbImplementor = dbImplementor;
    }
}
