public class Con2Observer implements IObserver {
    @Override
    public void update() {

    }

    @Override
    public void favorite(Subject subject) {
        subject.register(this);
    }
}
