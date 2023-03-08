public abstract class Observer {
    protected String userName;

    public Observer(String userName) {
        this.userName = userName;
    }

    public abstract void sendNotify(String productName);
}
