public class Context {
    protected Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public  void fiyatAl(){
        this.strategy.fiyatHesapla();
    }

}
