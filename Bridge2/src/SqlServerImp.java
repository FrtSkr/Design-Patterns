public class SqlServerImp implements IDBImplementor {

    @Override
    public void Execute() {
        System.out.println("Sql Execute");
    }

    @Override
    public void OpenCon() {
        System.out.println("Sql Open Connection");
    }
}
