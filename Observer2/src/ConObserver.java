public class ConObserver implements  IObserver {
    @Override
    public void update() {

    }

    @Override
    public void favorite(Subject subject) {
        subject.register(this);
    }
}
