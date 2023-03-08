public class Soket {

    private ISoketState nextState;

    public Soket() {
        this.nextState = new PortAc();
    }

    public void setNextState(ISoketState nextState) {
        this.nextState = nextState;
    }

    public void Do() {
        this.nextState.Handle(this);
    }
}
