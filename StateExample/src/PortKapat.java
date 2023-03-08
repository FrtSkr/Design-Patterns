public class PortKapat implements ISoketState {
    @Override
    public void Handle(Soket s) {
        System.out.println("Port Kapatılıyor!");
        s.setNextState(new PortAc());
    }
}
