public class PortAc implements ISoketState {
    @Override
    public void Handle(Soket s) {
        System.out.println("Port Açıldı!");
        s.setNextState(new PortDinle());
    }
}
