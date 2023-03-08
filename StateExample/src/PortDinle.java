public class PortDinle implements ISoketState {
    @Override
    public void Handle(Soket s) {
        System.out.println("Port Dinleniyor!");
        s.setNextState(new PortKapat());
    }
}
