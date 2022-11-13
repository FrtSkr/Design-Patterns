public class OracleImp implements IDBImplementor {

    @Override
    public void Execute() {
        System.out.println("Oracle Execute");
    }

    @Override
    public void OpenCon() {
        System.out.println("Oracle Open Connection");
    }
}
